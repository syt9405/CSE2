// Yutong Song
// 9/12/2014
// hw03 program #1
// Bicycle.java
// Write a program that prompts the user to enter two digits, the first giving the number of counts on a cyclometer and the second giving the number of seconds during which the counts occurred, and then an then prints out the distance traveled and the average miles per hour. Your program should assume the diameter of the wheel is 27 inches. See lab 02 for the details of the computation. Save your program in the file Bicycle.java (and of course name the class Bicycle). Recall that in lab 2 we only computed the distance and the number of minutes. The average miles per hour is that distance divided by the number of hours (the number of minutes divided by 60).


import java.util.Scanner;

// define a class
public class Bicycle {
    // add main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner ( System.in );
     
        
        System.out.print("Enter the number of seconds: ");
        int nSeconds = myScanner.nextInt();
        System.out.print("Enter the number of counts: ");
        int nCounts = myScanner.nextInt();
        
        // intermediate variables and output data
        double
        Distance, Minutes, AverageMph,
        WheelDiameter = 27.0,
        PI = 3.14159,
        InchesPerMile = 63360,
        secondsPerMinute = 60;
        
        // calculation
        Distance = (int)((nCounts * PI * WheelDiameter / InchesPerMile)*100) / 100.0;
        Minutes = ((int) (nSeconds / secondsPerMinute) * 10 ) / 10.0;
        AverageMph = (int)(((nCounts * PI * WheelDiameter / InchesPerMile) / Minutes) * 60 * 100) / 100.0;
        
        
        System.out.println(" The distance was " + Distance + " miles and took " + Minutes + "."  );
        System.out.println("The avarage mph was " + AverageMph + "." );
        
        
    } // end of main method
} // end of class