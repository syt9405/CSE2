import java.util.Scanner;
import java.util.Random;
public class exam3{
    public static void main (String[]args){
        
        
    showHands();
    //simulateOdds();
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
        
        
        
        
        
        
        
        
    
}