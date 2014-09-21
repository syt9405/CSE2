// Yutong Song
// 9/21/2014
// HW04 TimePadding
// Write a program that has the user enter an positive integer giving the number of seconds that have passed during the day and then displays the time in conventional form. (The problem here is displaying time with “padded” 0s, e.g., 10:03:05). Call the program TimePadding.java

import java.util.Scanner;

// define a class
public class TimePadding {
    // define the main method
    public static void main(String[]args){
        Scanner myScanner = new Scanner (System.in);
        
        System.out.print("Enter the time in seconds: ");                                                       // enter an input for seconds
        int nSeconds = myScanner.nextInt();
        
        int nHours = (int) (nSeconds/3600);                                                                    // calculate how many hours can given seconds convert to 
        int nMinutes = (int) ((nSeconds - (nHours*3600))/60);                                                  // calculate how many minutes can the rest seconds convert to
        int nNewSeconds = (int)(nSeconds - (nMinutes*60) - (nHours*3600));                                     // calculate the rest seconds
        
        if (nMinutes < 9 || nNewSeconds < 9) {                                                                 // all processes below are to adjust the final output into the given format
            System.out.println("The time is   " + nHours + ":0" + nMinutes + ":0" + nNewSeconds + "  .");
        }
        else if (nMinutes < 9 || nNewSeconds >= 9){
            System.out.println("The time is   " + nHours + ":0" + nMinutes + ":" + nNewSeconds + "  .");
        }
        else if (nMinutes >= 9 || nNewSeconds < 9){
            System.out.println("The time is   " + nHours + ":" + nMinutes + ":0" + nNewSeconds + "  .");
        }
        else {
        System.out.println("The time is   " + nHours + ":" + nMinutes + ":" + nNewSeconds + "  .");
        return;
        }
    }
}