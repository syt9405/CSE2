// Yutong Song
// 9/20/2014
// Hw04 Income Tax
// Objectives.  This homework gives you practice with selection statements, comparison operators, and Boolean expressions. Note that with multiple selections, the switch statement is preferred to a sequence of if statements.
// Program #1. Write a program that prompts the user to enter an int that gives the thousands of dollars of income and then writes out the amount of tax on the income, given the following (progressive) schedule:  <20, 5%;  >=20 and < 40, 7%; >=40 and < 78, 12%; >=78, 14%. Name the program IncomeTax.java.  You should make certain the user enters an integer and that the integer is greater than or equal to 0.

import java.util.Scanner;

// define a class
public class IncomeTax {
    // add main method
    public static void main(String[] args) {
      Scanner myScanner = new Scanner(System.in);
      
      
      System.out.print("Enter an int giving the number of thousands- ");
      
      
      if (myScanner.hasNextInt()) {
         int nIncome = myScanner.nextInt();                                                                                         // if the input is an int
                 
                 if (nIncome > 0){                                                                                                  // if the input is postive
                            if (nIncome < 20) {                                                                                     // if the income is less than 20,000, then the tax rate is 5%
                                 double taxCost1 = ((int)(nIncome * 1000 * 0.05 * 10))/10.0;
                                 System.out.println("The tax rate on $" + nIncome + ",000 is 5%, and the tax is $" + taxCost1);
                            }
                            else if (nIncome >= 20 && nIncome < 40){                                                                 // if the income is between 20,000 and 40,000, then the tax rate is 7%  
                                 double taxCost2 = ((int)(nIncome * 1000 * 0.07 * 10))/10.0;
                                 System.out.println("The tax rate on $" + nIncome + ",000 is 7%, and the tax is $" + taxCost2);
                            }
                            else if (nIncome >= 40 && nIncome < 78){                                                                 // if the income is between 40,000 and 78,000, then the tax rate is 12%
                                 double taxCost3 = ((int)(nIncome * 1000 * 0.12 * 10))/10.0;
                                 System.out.println("The tax rate on $" + nIncome + ",000 is 12%, and the tax is $" + taxCost3);
                            }
                            else {                                                                                                   // if the income is greater than 78,000, then the tax rate is 14%
                                 double taxCost4 = ((int)(nIncome * 1000 * 0.14 * 10))/10.0;
                                 System.out.println("The tax rate on $" + nIncome + ",000 is 14%, and the tax is $" + taxCost4);
                                 return; 
                            }
                }
                else {                                                                                                               // if the input is not positive
                  System.out.println("You did not enter a positive int.");
                  return;
                }
      }
      else {                                                                                                                         // if the input is not an int                      
          System.out.println("You did not enter a int.");
          return;
      }
      
      
    }
}