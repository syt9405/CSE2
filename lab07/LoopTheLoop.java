//Yutong Song
//10/10/2014
//lab07
// objective: For this lab session you write while loops and use a break statement. 

import java.util.Scanner;
public class LoopTheLoop{
    public static void main(String[]args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an int between 1 and 15 ");
        
        if(scan.hasNextInt()){
            int input = scan.nextInt();
            if(input>=1 && input<=15){
                int x=1;
                    while(x<=input){
                    System.out.print("*");
                    x++;
                    }
                    System.out.print("\n");
          
                x=1;
                    while (x<=input){
                        int n=1; //the number of stars in a row
                        while(n<=x){
                            System.out.print("*");
                            n++;
                        }
                    System.out.print("\n");
                    x++;
                    }
                    System.out.print("\n");
            }
            else{
                System.out.println("Your int was not in the range [1.15]");
                return;
            }
        }    
        else{
           return;
        }    
        
        
        
        
        int nStars = 10;
        int i=1; //the times of loop
        while(i<=nStars){
           System.out.print("*");
           i++;
        }
         System.out.print("\n");
          
          
          
          
          
        i=1;
        while (i<=nStars){
           int n=1; //the number of stars in a row
           while(n<=i){
           System.out.print("*");
           n++;
           }
        System.out.print("\n");
        i++;
        }
         System.out.print("\n");
         
         
       
       
    }
}