// Yutong Song
// 9/20/2014
// hw04 Month
// Program #2. Write a program that prompts the user to enter an integer for the month (1 for January, 2 for February, etc.)  and then displays the number of days in the month).  If the number 2 is entered (February) the user is then asked to enter the year. Make sure that the user enters an integer for the month and that the integer is in the required range. Similarly, if the year is requested, ensure that an int is entered, and that the int is positive. Save your program as Month.java.

import java.util.Scanner;

//define a class
public class Month {
    // add main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        
        System.out.print("Enter an int giving the number of the month (1-12)- ");                                                                       // enter the input
        
    
        if (myScanner.hasNextInt()){                                                                                                                    // if the input is an int
            int nMonth = myScanner.nextInt();
            
                  if (nMonth >= 1 && nMonth < 12){                                                                                                      // if the input is inside the range
                  
                        if (nMonth == 2){                                                                                                              // since February is special, I checked this option first
                                System.out.print("Enter an int giving the year ");
                              
                                if (myScanner.hasNextInt()){                                                                                            // input the value for year
                                    int nYear = myScanner.nextInt();
                                    
                                    if (nYear > 0){                                                                                                     // if the input value is positive
                                        int nRemainder1 = nYear % 100;
                                        
                                        if (nRemainder1 == 0){                                                                                           // if the year is divisible by 4, then February has 29 days
                                           int nNewRemainder = (nYear/100) % 4;
                                           
                                                if(nNewRemainder == 0){
                                                   System.out.println("The month has 29 days.");
                                                }
                                                 else {
                                                   System.out.println("The month has 28 days.");
                                                   return;
                                                 }
                                        }
                                        else {                                                                                                          // otherwise, there are 28 days inside February
                                               int nRemainder2 = nYear % 4;
                                                if (nRemainder2 == 0){
                                                    System.out.println("The month has 29 days.");
                                                }
                                                else {
                                                    System.out.println("The month has 28 days.");
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                    else {                                                                                                              // if the input value for year is not positive
                                        System.out.println("You did not enter a positive int for the year");
                                        return;
                                    }
                                }
                                else {                                                                                                                  // if the input value for year is not an int
                                    System.out.println("You did not enter an int for the year.");
                                    return;
                                }    
                        }
                        else if (nMonth == 1 || nMonth == 3 || nMonth == 5 || nMonth == 7 || nMonth == 8 || nMonth == 10 || nMonth == 12){            // listing months with 31 days
                                System.out.println("The month has 31 days.");
                        }
                        else {
                                System.out.println("The month has 30 days.");                                                                           // other than months with 31 days and February, the rest months have 30 days 
                                return;
                        }
                  }
                  else {                                                                                                                                // if the input value for month is not inside the range
                     System.out.println("You did not enter an int between 1 and 12." );
                     return;
                  }
        }
        else {                                                                                                                                          // if the input value for month is not an int
            System.out.println("You did not enter an int");
            return;
        }
    }
}
