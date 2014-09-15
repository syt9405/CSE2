// Yutong Song
// 9/12/2014
// hw03 program #2
// Root.java
// Write a program that prompts the user to enter a double and then prints out a crude estimate of the cube root of the number and the value of this crude guess when cubed. Save your program in the file Root.java. 


import java.util.Scanner;

// define a class
public class Root {
    // add main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        
        System.out.print("Enter a double, and I print its cube root- ");
        int numberValue = myScanner.nextInt();
        
        double guess1, guess2, guess3, guess4, guess5, EstimateValue;
        
        guess1 = numberValue/3;
        guess2 = (guess1*guess1*guess1+numberValue)/(3*guess1*guess1);
        guess3 = (2*guess2*guess2*guess2+numberValue)/(3*guess2*guess2);
        guess4 = (2*guess3*guess3*guess3+numberValue)/(3*guess3*guess3);
        guess5 = (2*guess4*guess4*guess4+numberValue)/(3*guess4*guess4);
        EstimateValue = guess5*guess5*guess5;
        
    System.out.print(" The cueb root is " + guess5 + ": ");
    System.out.print( guess5 + "*" + guess5 + "*" + guess5 + "=" + EstimateValue );
        
        
    } // end of main method
} // end the class