//Yutong Song
//hw10
//11/16/2014
/*Poker is played with the usual deck of 52 cards, which has four suits, 
each suit with “ranks” of either Ace, King, Queen, Jack, 10, 9, 8, 7, 6, 5, 4, 
3, or 2. A poker hand consists of five cards. A poker hand is said to have one 
pair if exactly two of the cards have the same rank, e.g., the hand {A, A, Q, 3, 
1} “has a pair”, while the hands {A, A, Q, Q, 2} and {A, 7, 5, 3, 2} do not. Use 
the main method provided below and do not change it, then write the methods 
showOneHand() and simulateOdds().*/



import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }


public static void showHands(){
String input;
do{
    String [] out = {"", "", "", "", ""};
    String [] rankArray = {"", "", "", "","" };
    int [] suitArray = new int [5];
    int rank = 0, suit = 0, x=0;
    
    for(int i=0; i<5; i++){
        x = (int)(Math.random()*52);
        rank = (x % 13);
        if (rank == 0){
        rankArray[i] = "A";
        }
        else if(rank == 10){
        rankArray[i] = "J";
        }
        else if(rank == 11){
        rankArray[i] = "Q";
        }
        else if(rank == 12){
        rankArray[i] = "K";
        }
        else{
        rankArray[i] = rank + "";
        }
        suit = (x / 13);
        suitArray[i] = suit;
    }
    
    for(int i=0; i<5; i++){
        if( suitArray[i] == 0){
            out[0] += rankArray[i] + " ";
        }
        else if( suitArray[i] == 1){
            out[1] += rankArray[i] + " ";
        }
        else if( suitArray[i] == 2){
            out[2] += rankArray[i] + " ";
        }
        else{
            out[3] += rankArray[i] + " ";
        }
    }
    
    System.out.println("diamond: " + out[0] );
    System.out.println("clubs: " + out[1] );
    System.out.println("spades: " + out[2] );
    System.out.println("hearts: " + out[3] );
    
    
    System.out.println("Go again? Enter 'y' or 'Y', anything else to quit- ");
    Scanner scan = new Scanner(System.in);
    input = scan.next();
    
    }while(input.equals("Y") || input.equals("y"));
}
        
       
public static void simulateOdds(){
    int nRanks = 0;
    int [] onePair = new int [13];
    int nOnePair = 0;
    int dup = 0;
    String [] list = {" A", " K", " Q", " J", "10", " 9", " 8", " 7", " 6", " 5", " 4", " 3", " 2"};
    int [] rank = new int [5];
    
    for(int n=0; n<10000; n++){                                                 // repeat the loop 10000 times 
        for(int i=0; i<5; i++){                                                 // get a random hand of five cards
            int x = (int)(Math.random() * 52);
            nRanks = (int)(x % 13);        
            rank[i] = nRanks;                                                   // save them in a array called reank[i]
        }    
        if(exactlyOneDup(rank)){                                                // calling a new method to find whether there are exactly one pair  
            for(int i=0; i<5; i++){
                for(int j=(i + 1); j<5; j++){
                    while(rank[i] == rank[j] ){
                        dup = rank[i];                                          // find out the value which has exactly two repeats
                        break;
                    }
                }
            }
        onePair[dup] +=1;                                                       // sum the number of exactly two repeats in one hand and group them by ranks
        }
        else{
            nOnePair++;                                                         // sum the number of "total not exactly one pair"
        }
    }

    System.out.println("rank   freq of exactly one pair");
    for(int i=0; i<13; i++){
    System.out.println( " " + list[i] + "              " + onePair[i] );
    }
    System.out.println("------------------------");
    System.out.println(" total not exactly one pair: " + nOnePair);
}


public static boolean exactlyOneDup(int [] num){                                // the new method that check whether there is exactly one pair in a hand
    boolean x;
    int a=0;
    for(int i=0; i<5; i++){ 
        for(int j=1+i; j<5; j++){
            if (num[i] == num[j]){
                a++;
            }
        }
    }
    if(a == 1){
        x = true;
    }
    else{
        x = false;
    }
    return x;      
  }
    
    


    
        
    
    
  

}