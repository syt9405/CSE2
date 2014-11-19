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
    int nSuits = 0, nRanks = 0;

        String hands[] = {"", "", "",""};                                       // initialized three new arrays
        String rank[] = {"", "", "", "", ""};
        int suits[] = new int [5];
        for(int i=0; i<5; i++){                                                 // random out 5 hands 
            int x = (int)(Math.random() * 51);
                nSuits = (int)(x / 13);                                         // range is from 0-3. total 4 types
                nRanks = (int)(x % 13);                                         // range is from 0-12, total 13 types
                suits[i] = nSuits;                                              // let array suits[i] map to each nSuits value
         
            if(nRanks == 1){ rank[i] = " A";}                                    // if the random rank is 1, then it appear "A" in the array
            else if (nRanks == 11){rank[i] = " J";}                              // if the random rank is 11, then it appear "J" in the array
            else if (nRanks == 12){rank[i] = " Q";}                              // if the random rank is 12, then it appear "Q" in the array
            else if (nRanks == 13){rank[i] = " K";}                              // if the random rank is 13, then it appear "K" in the array
            else{rank[i] = " "+nRanks;}                                          // otherwise, rank[i] equals to the number itself
        }
        
        for(int i=0; i<5; i++){                                                 // pairing outcomes based on suits
            if(suits[i] == 0){ hands[0] += rank[i];}            
            else if(suits[i] == 1){hands[1] += rank[i];}
            else {hands[3] += rank[i];}
        }
        
        hands[0] = "Clubs: " + hands[0];                                        // redefining the value of array hands[i]
        hands[1] = "Diamonds: " + hands[1];
        hands[2] = "Hearts: " + hands[2];
        hands[3] = "Spades: " + hands[3];
        
        for (int i=0; i<4; i++){ System.out.println(hands[i]);}                 // print out hands[i] value
        
        System.out.println("");
        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");// ask user to run again or not
        Scanner scan = new Scanner(System.in);
        input = scan.next();

    }while(input.equalsIgnoreCase("y"));                                        // if the input is y or Y, then the program repeats
}        
        
       
public static void simulateOdds(){
    int nRanks = 0;
    int [] onePair = new int [10000];
    int nOnePair = 0;
    int a = 0;
    int dup = 0;
    String [] list = {" A", " K", " Q", " J", "10", " 9", " 8", " 7", " 6", " 5", " 4", " 3", " 2"};

    
    int [] rank = new int [5];
    
    for(int n=0; n<10000; n++){
        for(int i=0; i<5; i++){
            int x = (int)(Math.random() * 52);
            nRanks = (int)(x % 13);        
            rank[i] = nRanks;
        }    
        if(exactlyOneDup(rank)){
            for(int i=0; i<5; i++){
                for(int j=(i + 1); j<5; j++){
                    while(rank[i] == rank[j] ){
                        dup = rank[i];
                        break;
                    }
                }
            }
        onePair[dup] +=1;
        }
        else{
            nOnePair++;
        }
    }

    System.out.println("rank   freq of exactly one pair");
    for(int i=0; i<13; i++){
    System.out.println( " " + list[i] + "              " + onePair[i] );
    }
    System.out.println("------------------------");
    System.out.println(" total not exactly one pair: " + nOnePair);
}


public static boolean exactlyOneDup(int [] num){
    boolean x;
    int a=0;
    for(int i=0; i<5; i++){ 
        for(int j=1+i; j<5; j++){
            if (num[i] == num[j]){
                a++;
            }
            else{
                a=a;
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