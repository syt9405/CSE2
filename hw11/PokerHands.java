// Yutong Song
//hw10

//objective:  This homework gives you practice in manipulating arrays 
//and multidimensional arrays, in writing methods that have array parameters, 
//and in searching and sorting arrays.

import java.util.Scanner;

public class PokerHands{
    public static void main(String [] arg){
        Scanner scan = new Scanner (System.in);
        String anotherHand, nSuit, nRank;
        int [] hand = {0,0,0,0,0};

            System.out.print("Enter 'y' or 'Y' to enter another hand- ");                                                         //determine whether the user wants to entwe another hand
            anotherHand = scan.next();
            if (anotherHand.equals ("Y") || anotherHand.equals ("y")){
                
            do{
                for (int i=0; i<5; i++){                                                                                          // there are five cards in one hand
                        
                        System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
                        nSuit = scan.next();
                        while (!nSuit.equals ("c") && !nSuit.equals ("d") && !nSuit.equals ("h") && !nSuit.equals ("s")){         // if the user did not enter c, d, h or s, then the system asks the user to enter again
                            System.out.println("You did not enter a valid response");
                            System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
                            nSuit = scan.next();
                            continue;
                        }
                        
                    	String suit[]={"c", "d", "h", "s"};
                        int [] suitNumber = new int[5];
                        for( int j=0; j<4; j++){
                            if(nSuit.equals(suit[j])){
                                suitNumber[i] = j;    
                            }
                        }

                        System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
                        nRank = scan.next();
                        while (!nRank.equals ("a") && !nRank.equals ("k") && !nRank.equals ("q") && !nRank.equals ("j")
                            && !nRank.equals ("10") && !nRank.equals ("9") && !nRank.equals ("8") && !nRank.equals ("7") 
                            && !nRank.equals ("6") && !nRank.equals ("5") && !nRank.equals ("4") && !nRank.equals ("3")
                            && !nRank.equals ("2")){                                    // if the user did not enter c, d, h or s, then the system asks the user to enter again
                            System.out.println("You did not enter a valid response");
                            System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
                            nRank = scan.next();
                            continue;
                        }
                        
	                    String rank[]={"a","k","q","j","10","9","8","7","6","5","4","3","2"};
                        int [] rankNumber = new int [5];
                        for( int k=0; k<13; k++){
                            if (nRank.equals(rank[k])){
                                rankNumber[i] = k;
                            }
                        }

                        hand[i] = (13 * suitNumber[i]) + rankNumber[i];

                        for(int x=i-1; x>=0; x--){                                                                                   // check input duplicates
                            if (hand[i] == hand[x]){
                                System.out.println("handx" + hand[x] + "handi" + hand[i] );
                                System.out.println("You already entered that card");
                                i--;
                                break;
                            }   
                        }
                }
                showOneHand (hand);
                System.out.println("");
                round (hand);
                System.out.print("Enter 'y' or 'Y' to enter another hand- ");
                anotherHand = scan.next();
            }while(anotherHand.equals ("Y") || anotherHand.equals ("y"));                                                         // ask the user to re-run the program
        }
    }

public static void round (int hand[]){                                                                                            //I am calling a new method to print out the type of winning
    
    int [] suit = new int [5];
    int [] rank = new int [5];
    
    

    for (int i=0; i<5; i++){                                                                                                      //create two matching arrays suit and rank
        suit[i] = hand[i] / 13;
        rank[i] = hand[i] % 13;
    }
    
    for (int x=0; x<5; x++){                                                                                                      //sort rank[i] with ascending order
        for (int y=x; y<5; y++){
            if (rank[y] < rank[x]){
                int temp = rank[x];
                rank[x] = rank[y];
                rank[y] = temp;
            }
        }
    }
    
    int count1=1;
    if( suit[0] == suit[1] && suit[0] == suit[2] && suit[0] == suit[3]                                                            // same suit
        && suit[0] == suit[4]){                                                 
        
        if(rank[0] == 0 && rank[1] == 1 && rank[2] == 2 && rank[3] == 3 && rank[4] == 4){                                         // first four elements are the same (4,1)
            System.out.println("This is a Royal Flush");   
        }
        else if((rank[4] - rank[3] == 1)&&(rank[3] - rank[2] == 1)                                                                //same suit and straight
        &&(rank[2] - rank[1] == 1)&&(rank[1] - rank[0] == 1)){  
            System.out.println("This is a Straight Flush");   
        }
        else{
            System.out.println("This is a flush");                                                                                //just same suit
        }
    }
    else{
        for (int a=1; a<5; a++){
            if (rank[0] == rank[a]){
                count1++;
            }
        }
        
        if(count1 == 4){                                                            // five cards arranged as (4,1)
            System.out.println("This is a Four of a Kind");
        }
        else if(count1 == 3){
            if (rank[3] == rank[4]){                                                //(3,2)
                System.out.println("This is a Full House");
            }
            //else{
            //    System.out.println("This is either a Straight or a High Card");     //(3,1,1)
            //}
        }
        else if(count1 == 2){
            if (rank[2] == rank[3] && rank[3] == rank[4]){                          //(2,3)
                System.out.println("This is a Full House");
            }           
            else if(rank[2] != rank[3] && rank[3] != rank[4]){           
                System.out.println("This is a One Pair");                           //(2,1,1,1)
            }
            else{
                System.out.println("This is a Two Pair");           
            }
        }
        else{
            if(rank[1] == rank[2] && rank[2] == rank[3] && rank[3] == rank[4]){      //(1,4)
                System.out.println("This is a Four of a Kind");
            }
//            else if(rank[1] == rank[2] && rank[1] == rank[3] && rank[1] != rank[4]){ //(1,3,1)
//                System.out.println("This is either a Straight or a High Card");     
//            }
            else if(rank[1] == rank[2] && rank[2] != rank[3] && rank[3] == rank[4]){ //(1,2,2)
                System.out.println("This is a Two Pair");
            }
            else if(rank[1] == rank[2] && rank[1] != rank[3] && rank[1] != rank[4]){ //(1,2,1,1)
                System.out.println("This is a One Pair");
            }
//            else if(rank[1] != rank[2] && rank[2] == rank[3] && rank[3] != rank[4]){ //(1,1,3)
//                System.out.println("This is either a Straight or a High Card");     
//            }
            else if(rank[2] == rank[3] && rank[1] != rank[2] && rank[2] != rank[4]){ //(1,1,2,1)
                System.out.println("This is a One Pair");
            }
            else if(rank[3] == rank[4] && rank[1] != rank[3] && rank[2] != rank[3]){ //(1,1,1,2)
                System.out.println("This is a One Pair");
            }
            else{                                                                    //(1,1,1,1,1)
                if((rank[4] - rank[3] == 1)&&(rank[3] - rank[2] == 1)                // straight
                    &&(rank[2] - rank[1] == 1)&&(rank[1] - rank[0] == 1)){
                    System.out.println("This is a Straight");
                }
                else{                                                                //high card
                System.out.println("This is a High Card");
                }
            }
        }
    }
}    


public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
	String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }
}
