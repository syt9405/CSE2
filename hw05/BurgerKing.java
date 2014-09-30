// Yutong Song
// 9/28/2014
// hw05 BurgerKing
// Now Burger King gets its chance. Write a program that prompts the user to enter a choice of a burger, a soda, or fries. Then the program prompts the users for details of their choices. 


import java.util.Scanner;

public class BurgerKing {
    public static void main(String[]args){
        
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter a letter to indicate a choice of" + "\n\tBurger (B or b)" + "\n\tSoda (S or s)" + "\n\tFries (F or f)");
        String input = myScanner.next();
        
        if (input.length()<2){
            char value1 = input.charAt(0);
            
            switch (value1){
                case 'b':
                    System.out.println("Enter A or a for all the fixins" + "\n\tC or c for cheese" + "\n\tN or n for none of the above");
                    if (myScanner.hasNextChar){     
                        char Value2 = myScanner.next();
                        switch(value2){
                            case 'A':
                                System.out.println("You ordered all the fixins.");
                                break;
                            case 'a':
                                System.out.println("You ordered all the fixins.");
                                break;    
                            case 'C':
                                System.out.println("You ordered a burger with cheese");
                                break;
                            case 'c':
                                System.out.println("You ordered a burger with cheese");
                                break;   
                            case 'N':
                                System.out.println("none of above");
                                break;
                            case 'n':
                                System.out.println("none of above");
                                break;
                            default:
                                System.out.println("You did not enter any of A, a, C, c, N, or n");
                                break;
                        }   
                    }
                    else{
                        System.out.println("a single character expected");
                        return;
                    }
                case 'B':
                    System.out.println("Enter A or a for all the fixins" + "\n\tC or c for cheese" + "\n\tN or n for none of the above");
                    if (myScanner.hasNextChar){
                        char Value3 = myScanner.next();
                        switch(value3){
                            case 'A':
                                System.out.println("You ordered all the fixins.");
                                break;
                            case 'a':
                                System.out.println("You ordered all the fixins.");
                                break;    
                            case 'C':
                                System.out.println("You ordered a burger with cheese");
                                break;
                            case 'c':
                                System.out.println("You ordered a burger with cheese");
                                break;   
                            case 'N':
                                System.out.println("none of above");
                                break;
                            case 'n':
                                System.out.println("none of above");
                                break;
                            default:
                                System.out.println("You did not enter any of A, a, C, c, N, or n");
                                break;
                        }        
                    }  
                    else{
                        System.out.println("a single character expected");
                        return;
                    }
                case 's':
                    System.out.println("Do you want Pepsi (p or P)," + "\n\tCoke (c or C), Sprite (s or S) or Mountain Dew (M or m)- ");
                    if (myScanner.hasNextChar){
                        char value4 = myScanner.next();
                        switch(value4){
                            case 'p':
                                System.out.println("You ordered a Pepsi");
                                break;
                            case 'P':
                                System.out.println("You ordered a Pepsi");
                                break;
                            case 'c':
                                System.out.println("You ordered a Coke");
                                break;
                            case 'C':
                                System.out.println("You ordered a Coke");
                                break;
                            case 's':
                                System.out.println("You ordered a Sprite");
                                break;
                            case 'S':
                                System.out.println("You ordered a Sprite");
                                break;
                            case 'm':
                                System.out.println("You ordered a Mountain Dew");
                                break;
                            case 'M':
                                System.out.println("You ordered a Mountain Dew");
                                break;
                            default:
                                System.out.println("You did not enter any of p, P, c, C, s, S, m, or M");
                                break;
                        }
                    }
                    else{
                        System.out.println("a single character expected");
                        return;
                    }
                case 'S':
                    System.out.println("Do you want Pepsi (p or P)," + "\n\tCoke (c or C), Sprite (s or S) or Mountain Dew (M or m)- ");
                    if (myScanner.hasNextChar){
                        char value5 = myScanner.next();
                        switch(value5){
                            case 'p':
                                System.out.println("You ordered a Pepsi");
                                break;
                            case 'P':
                                System.out.println("You ordered a Pepsi");
                                break;
                            case 'c':
                                System.out.println("You ordered a Coke");
                                break;
                            case 'C':
                                System.out.println("You ordered a Coke");
                                break;
                            case 's':
                                System.out.println("You ordered a Sprite");
                                break;
                            case 'S':
                                System.out.println("You ordered a Sprite");
                                break;
                            case 'm':
                                System.out.println("You ordered a Mountain Dew");
                                break;
                            case 'M':
                                System.out.println("You ordered a Mountain Dew");
                                break;
                            default:
                                System.out.println("You did not enter any of p, P, c, C, s, S, m, or M");
                                break;
                        }
                    }
                    else{
                        System.out.println("a single character expected");
                        return;
                    }    
                case 'f':
                    System.out.println("Do you want a large or small order of fries (l,L,s, or S)- ");
                    if (myScanner.hasNextChar){
                        char value6 = myScanner.next();
                        switch(value6){
                            case 'l':
                                System.out.print("You ordered large fries");
                                break;
                            case 'L':
                                System.out.print("You ordered large fries");
                                break;
                            case 's':
                                System.out.print("You ordered small fries");
                                break;
                            case 'S':
                                System.out.print("You ordered small fries");
                                break;
                            default:
                                System.out.println("You did not enter any of l, L, s, or S" );
                                break;
                        }        
                    }
                    else{
                        System.out.println("a single character expected");
                        return;
                    }
                case 'F':
                    System.out.println("Do you want a large or small order of fries (l,L,s, or S)- ");
                    if (myScanner.hasNextChar){
                        char value7 = myScanner.next();
                        switch(value7){
                            case 'l':
                                System.out.print("You ordered large fries");
                                break;
                            case 'L':
                                System.out.print("You ordered large fries");
                                break;
                            case 's':
                                System.out.print("You ordered small fries");
                                break;
                            case 'S':
                                System.out.print("You ordered small fries");
                                break;
                            default:
                                System.out.println("You did not enter any of l, L, s, or S" );
                                break;
                        }        
                    }
                    else{
                        System.out.println("a single character expected");
                        return;
                    }    
                default:
                    System.out.println("You did not enter any of b, B, s, S, f, or F");
                    break;
            }
        }
        else {
            System.out.println("a single character expected");
            return;
        }
            
    
                
                
                
                
                
    }
}