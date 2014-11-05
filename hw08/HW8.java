//Yutong Song
//hw08   10/24/2014

//Objectives.  This homework has the objective of giving you practice in writing methods, overloading methods, and in forcing the user to enter good input. 

import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");

  }  


    public static char getInput(Scanner scan, String s){                        // define the first method
      String input = scan.next();
      while(true){
      if (input.length()==1){                                                   // check whether the input has only one character
        if (input.charAt(0) == s.charAt(0) || input.charAt(0) == s.charAt(1)){   // match input with given condition
          return input.charAt(0);                                               // define the new value of input
        }
        else{                                                                   // if the input contains a different character than the given condition
          System.out.print("You did not enter a character from the list '" + s +"'; try again- ");
          input = scan.next();                                                  // redefine the input
        }
      } 
      else {                                                                    // if the input has more than one characters
        System.out.print("You should enter exactly one character- ");
        input = scan.next();                                                    // redefine the input
      }
      }
  }

  
  public static char getInput(Scanner scan, String x, int n){                   // define the second method
    String input = scan.next();                                                   
      int i=0;
      while (i<n){                                                              // run the while loop n times
        if (input.length()==1){                                                 // if the input has only one character
          if (input.charAt(0) == x.charAt(0) || input.charAt(0) == x.charAt(1) || input.charAt(0) == x.charAt(2) || input.charAt(0) == x.charAt(3)){                                                 //if the input matchs one of the given conditions
            return input.charAt(0);                                             //redefine the input
          }
          else {                                                                //if the input does not have a character from the list
            System.out.print("You did not enter a character from the list 'yYnN'; try again- ");
            input = scan.next();                                                // redefine the input
          }
        }
        else{                                                                   // if the input has more than one character
            System.out.print("You did not enter a character from the list 'yYnN'; try again- ");
            input = scan.next();                                                // redefine the input
        }
      i++;                                                                      // increase i by one for each run
      }      
      System.out.println("You failed after " + n + " tries"); 
      return ' ';
  }  

  
  public static char getInput(Scanner scan, String a, String b){                // define the third new method
  System.out.println("Choose a digit.");
      System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
      String input = scan.next();        
          while (true){
            if (input.length()==1){                                             // if the input has only one character
              if(input.charAt(0) == b.charAt(0) || input.charAt(0) == b.charAt(1) || input.charAt(0) == b.charAt(2) || input.charAt(0) == b.charAt(3) || input.charAt(0) == b.charAt(4) || input.charAt(0) == b.charAt(5) || input.charAt(0) == b.charAt(6) || input.charAt(0) == b.charAt(7) || input.charAt(0) == b.charAt(8) || input.charAt(0) == b.charAt(9) ){
              return input.charAt(0);
              }
              else{                                                             // if the input does not contain any character matching with the given condition
                System.out.println("You did not enter an acceptable character ");
                System.out.println("Choose a digit.");
                System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
                input = scan.next();                                            // redefine the input value
              }
            }
            else{                                                               // if the input has more than one characters
                System.out.println("Enter exactly one character");
                System.out.println("Choose a digit.");
                System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
                input = scan.next();                                            // redefine the input value
            }
        }
  }
}  


