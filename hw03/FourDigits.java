// Yutong Song
// 9/14/2014
// hw03 program 3 
// FourDigits.java
// Write a program that prompts the user to enter a double and  then prints out the first four digits to the right of the decimal point. 

import java.util.Scanner;

// define a class
public class FourDigits {
    //add main method
    public static void main(String[]args) {
        Scanner myScanner = new Scanner (System.in);
        
        System.out.print("Enter a double and I display the four digits to the right of the decimal point- ");
        double nValue = myScanner.nextDouble();
        
        int a = (int) (nValue*10)%10;      // the first digit after the decimal point
        int b = (int) (nValue*100)%10;     // the second digit after the decimal point
        int c = (int) (nValue*1000)%10;    // the third digit after the decimal point
        int d = (int) (nValue*10000)%10;   // the fourth digit after the decimal point
        
      System.out.println("The four digits are " + a + b + c + d);
        
        
        
        
    }
}



