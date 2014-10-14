/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an int- ");
    
    if(scan.hasNextInt()){
      int n=scan.nextInt();
      System.out.println("You entered "+n);
      System.out.println("sum is 25");
      System.out.println("Again, you entered "+n);
    }
    else{
      System.out.println("Enter an int- ");
    }
    
    
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 *
 * In the original code, there is a useless switch statement. I deleted it and replaced it with a direct printout statement. 
 *
 */

