// Yutong Song
// 9/28/2014
// hw05 BurgerKing
// Now Burger King gets its chance. Write a program that prompts the user to enter a choice of a burger, a soda, or fries. Then the program prompts the users for details of their choices. 


import java.util.Scanner;

public class BurgerKing {
    public static void main(String[]args){
        
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter a letter to indicate a choice of" + "\n\tBurger (B or b)" + "\n\tSoda (S or s)" + "\n\tFries (F or f)   ");             // three options to choose from: Burger, Soda, and Fries
        String input1 = myScanner.next();                                                                                                                 // create a variable matching the user input
        
        if (input1.length()<2){                                                                                                                           // if the user type in only one letter
            char value1 = input1.charAt(0);                                                                                                               // assign value1 as the user input
            
            switch (value1){         
                case 'b':                                                                                                                                 // if the user choose burger
                case 'B':    
                    System.out.println("Enter A or a for all the fixins" + "\n\tC or c for cheese" + "\n\tN or n for none of the above   ");              // three options to be chosen from: "all the fixins", cheese, or none of the above
                    String input2 = myScanner.next();                                                                                                     // assign input2 as the value user typing in
                    if (input2.length()<2){                                                                                                               // if the user type in only one letter
                        char value2 = input2.charAt(0);                                                                                                   // assign value2 as the value user typing in
                        switch(value2){
                            case 'A':                                                                                                                     // if the user types in a or A, then prints out "You ordered all the fixins"
                            case 'a':    
                                System.out.println("You ordered all the fixins.");
                                break;
                            case 'C':                                                                                                                     // if the user types in c or C, then prints out "You ordered a burger with cheese"
                            case 'c':                                                         
                                System.out.println("You ordered a burger with cheese");
                                break;
                            case 'N':                                                                                                                     // if the user type in n or N, then prints out "None of above"
                            case 'n':
                                System.out.println("none of above");
                                break;
                            default:                                                                                                                       // if the user types in other letters, then prints out "You did not enter any of A, a, C, c, N, or n"
                                System.out.println("You did not enter any of A, a, C, c, N, or n");
                                break;
                        }   
                    }
                    
                    else{                                                                                                                                  // if the user types in more than one letter
                        System.out.println("a single character expected");
                        //return;
                    }
                break;
                case 's':                                                                                                                                  // if the user chose Soda option from the first question, then he has another three choices
                case 'S':    
                    System.out.println("Do you want Pepsi (p or P)," + "\n\tCoke (c or C)," + "\n\t Sprite (s or S)" + "\n\tor Mountain Dew (M or m)- ");
                    String input3 = myScanner.next();
                    if (input3.length()<2){
                        char value3 = input3.charAt(0);
                        switch(value3){
                            case 'p':                                                                                                                      // if the user types in p or P, then prints out "You ordered a Pepsi"
                            case 'P':    
                                System.out.println("You ordered a Pepsi");
                                break;
                            case 'c':                                                                                                                      // if the user types in c or C, then prints out "You ordered a Coke"
                            case 'C':    
                                System.out.println("You ordered a Coke");
                                break;
                            case 'S':                                                                                                                      // if the user types in s or S, then prints out "You ordered a Sprite"
                            case 's':
                                System.out.println("You ordered a Sprite");
                                break;
                            case 'M':                                                                                                                      // if the user types in m or M, then prints out "You ordered a Mountain Dew"
                            case 'm':
                                System.out.println("You ordered a Mountain Dew");
                                break;
                            default:                                                                                                                       // if the user types in other letters, then prints out "You did not enter any of p, P, c, C, s, S, m, or M"
                                System.out.println("You did not enter any of p, P, c, C, s, S, m, or M");
                                break;
                        }
                    }
                    else{                                                                                                                                  // if the user types in more than one letter
                        System.out.println("a single character expected");
                        return;
                    }
                        
                case 'f':                                                                                                                                  // if hte user chooses fries from the first question
                case 'F':
                    System.out.println("Do you want a large or small order of fries (l,L,s, or S)- ");
                    String input5 = myScanner.next();
                    if (input5.length()<2){
                        char value5 = input5.charAt(0);
                        switch(value5){
                            case 'l':                                                                                                                      // if the user types in l or L, then prints out "You ordered large fires"
                            case 'L':    
                                System.out.println("You ordered large fries");
                                break;
                            case 'S':                                                                                                                      // if the user types in s or S,then prints out "You ordered small fires"
                            case 's':
                                System.out.println("You ordered small fries");
                                break;
                            default:                                                                                                                       // if the user types in other letters, then print out "You did not enter any of l, L, s, or S"
                                System.out.println("You did not enter any of l, L, s, or S- " );
                                break;
                        }        
                    }
                    else{                                                                                                                                  // if the user types more than one letter 
                        System.out.println("a single character expected");
                        return;
                    }
                    break;
                default:
                    System.out.println("You did not enter any of b, B, s, S, f, or F");                                                                    // matching to the first question, the user trypes in other letters
                    break;
            }
        }
        else {                                                                                                                                             // if the user trypes more than one letter to answer the first question
            System.out.println("a single character expected");
            return;
        }
    }
}