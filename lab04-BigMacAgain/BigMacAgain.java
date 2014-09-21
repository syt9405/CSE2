// Yutong Song
// 9/19/2014
// Lab04-BigMacAgain
// Objectives. This lab session will demonstrate how you can use selection statements to run code only under specific conditions.
// Assignment: Write a program that uses the Scanner class to obtain from users how many Big Macs they want and whether they want an order of fries. It then prints out the total cost of the meal. Big Macs still cost $2.22 each,  and an order of fries costs $2.15. 

import java.util.Scanner; //

// define a class
public class BigMacAgain {
    // add main method	
     public static void main(String[] args) {
         
         Scanner myScanner = new Scanner( System.in ); //myScanner is only a variable. 
         
          double bigMac$ = 2.22;          // the price per burger
          double fries$ = 2.15;           // the price per fries
          double bigMacCost, totalCost;   // define variables: bigMacCost and totalCost
          
          
          
          System.out.print(" Enter the number of Big Macs: "); 
          
           
          if (myScanner.hasNextInt () ) {   
           int nBigMacs = myScanner.nextInt();    // whether the input is an integer
           
             if (nBigMacs > 0){         // whether the input is positive
                bigMacCost = ((int)(nBigMacs * bigMac$*10))/10.0;    // the total cost of burgers
                totalCost = fries$ + bigMacCost;    // the total order
                System.out.println("You ordered " + nBigMacs + " Big Macs for a cost of " + nBigMacs + " * " + bigMac$ + " = $" + bigMacCost );
                 }
             else {
              System.out.println("You did not enter an int > 0");
              return;
                }
             }
          else {
              System.out.println("You did not eneter an int");
              return; // leaves the program
             }
           
           
           System.out.print("Do you want an order of fries (Y/y/N/n)? ");
           String orderFries = myScanner.next();
           if (orderFries.equals("Y")||orderFries.equals("y")){
            System.out.println("You ordered fries at a cost of $2.15");
            System.out.println("The total cost of the meal is $" + totalCost );
             }
           else if (orderFries.equals("N")||orderFries.equals("n")){
            System.out.println("The total cost of the meal is $" + bigMacCost);
           }
           else {
            System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");
            return;
           }
            
                    
     }
}