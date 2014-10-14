/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    
    if (scan.hasNextInt()){
      int x = scan.nextInt();
      
          if (x<100){ 
            System.out.println("You entered "+x+"%");
            double a = (double)(1-x/100.0);
            System.out.println("The proportion remaining is " + a); 
          }
          else{
            System.out.println("The input number does not have a proportion remaining");
            return;
          }
    }
    else{
      System.out.println("You did not enter an integer.");
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
 *    The original input did not seperate non-integer inputs and over 100 inputs. Those inputs could not inform proportion remainings.
 *    In addition, the original code only listed a few possible outcomes. I improved it into all cases. 
 * 
 * 
 */

