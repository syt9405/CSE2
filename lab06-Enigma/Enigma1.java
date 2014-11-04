//Yutong Song
// lab06

/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    Scanner scan = new Scanner(System.in);
    if (scan.hasNextDouble()){
    double x= scan.nextDouble();
        if (x<100){
            System.out.println("You entered "+x+"%");
            System.out.println("The proportion remaining is "+ (1-x/100));
        }
        else{
            System.out.println("invalid input");
            return;
        }
    }
    else{
      System.out.println("invalid input");
      return;
    }
   }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * 
 *    The only acceptible input is integer. 
 *    We need to check wether the input is integer first and then check wheter it is less than 100. 
 *    At the end, we calculate the remaining proportion and print it out.
 * 
 */


