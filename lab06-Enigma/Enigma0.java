// Yutong Song
// lab06
/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */


import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    
    
    /*if(scan.hasNextInt()){
      int n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      int n=4;
      System.out.println("You entered "+n);
    }
    */
    
    if(scan.hasNextInt()){
      int n=scan.nextInt();
      System.out.println("You entered "+n);
    
      
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
    }
    
    
     else{
      int n=4;
      System.out.println("You entered "+n);
    }
  }
}




/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
     The orignial code defined the variable n inside the "for" loop instead of the 
     main method, which causes the printed statement problem of finding the variable. 
     
     I changed all print out statements inside loops. 
 */

