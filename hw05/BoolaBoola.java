// Yutong Song
// 9/28/2014
// hw05 BoolaBoola.java
// Write a program that has three boolean variables to each of which the value of true or false is randomly assigned. Then, at random, combine the three variables with random choices of && and || and stores the result. For example, one might have the expression true && false || true (there are 32 possible expressions, so I will not list all the possibilities). The program should then present the expression to the user and ask the user to state the result of of the expression. 

import java.util.Scanner;

public class BoolaBoola{
    public static void main(String[]args){
        
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        boolean a=(Math.random()<0.5);                                                                                                           // define the variable "a" which is randomly assigned as true or false
        boolean b=(Math.random()<0.5);                                                                                                           // define the variable "b" which is randomly assigned as true or false 
        boolean c=(Math.random()<0.5);                                                                                                           // define the variable "c" which is randomly assigned as true or false
        
        boolean r1 = (a && b && c),                                                                                                              // define the variable r1 as the result of the following function
                r2 = (a && b || c),                                                                                                              // define the variable r2 as the result of the following function
                r3 = (a || b && c),                                                                                                              // define the variable r3 as the result of the following function
                r4 = (a || b || c);                                                                                                              // define the variable r4 as the result of the following function
                
        
       
        System.out.println("Does " + "( " + a +  " && " +  b + " && " + c +" ) " + "have the value true(t/T) or false(f/F)? ");                  // print out the question which asks for inputing the result of function 1
            
            String input = myScanner.next();
            if (input.length () <2){                                                                                                             // if the input is only one letter 
                char input1 = input.charAt(0);
                    switch (input1){
                            case 'f':
                            case 'F':                                                                                                            // if the input is f or F, then compare false with r1
                                if ( r1 == false){
                                    System.out.println ("Correct");                             
                                }
                                else{
                                    System.out.println("Wrong; try again");
                                    // return;
                                }
                                break;
                                
                            case 't':                                                                                                            // if the input is t or T, then compare true with r1
                            case 'T': 
                                if ( r1 == true ){
                                    System.out.println ("Correct");
                                }
                                else{
                                    System.out.println("Wrong; try again");
                                    //return;
                                }
                                break;
                                     
                            default:                                                                                                            // if the input is other t, T, f, F
                                System.out.println("Wrong; try again");
                                break;
                   }            
            }
            else{                                                                                                                               // if the input is more than one letter
                System.out.println("Wrong; try again");
                //return;
            }
            
            
        System.out.println("Does " + " ( " + a + " && " + b + " || " + c + " ) " + "have the value true(t/T) or false(f/F)? ");                 // print out the question which asks for inputing the result of function 2
        
         input = myScanner.next();
            if (input.length () <2){
                char input2 = input.charAt(0);
               
                   switch (input2){
                    
                            case 'f':                                                                                                           // if the input is f or F, then compare false with r2
                            case 'F':    
                                if ( r2 == false){
                                    System.out.println ("Correct");
                                }
                                else{
                                    System.out.println("Wrong; try again");
                                    //return;
                                }
                                break;
                                
                            case 't':                                                                                                           // if the input is t or T,then compare true with r2
                            case 'T':
                                if ( r2 == true ){
                                    System.out.println ("Correct");
                                }
                                else{
                                    System.out.println("Wrong; try again");
                                    //return;
                                }
                                break;
                                     
                            default:                                                                                                            // if the input is other than f, F, t, T
                                System.out.println("Wrong; try again");
                                break;
                   }            
            }
            else{                                                                                                                               // if the input is more than one letter
                System.out.println("Wrong; try again");
                }
            
        System.out.println("Does " + " ( " + a + " || " + b + " && " + c + " ) " + "have the value true(t/T) or false(f/F)? ");                 // print out the question which asks for inputing the result of function 3
          
         input = myScanner.next();
            if (input.length () <2){
                char input3 = input.charAt(0);
               
                   switch (input3){
                   
                            case 'f':                                                                                                           // if the input is f, or F, then compare false with r3
                            case 'F':    
                                if ( r3 == false){
                                    System.out.println ("Correct");
                                }
                                else{
                                    System.out.println("Wrong; try again");
                                    //return;
                                }
                                break;
                                
                            case 't':                                                                                                           // if the input is t, or T, then compare true with r3
                            case 'T':                                                       
                                if ( r3 == true ){
                                    System.out.println ("Correct");
                                }
                                else{
                                    System.out.println("Wrong; try again");
                                    //return;
                                }
                                break;
                                     
                            default:                                                                                                            // if the input is other than t, T, f, F
                                System.out.println("Wrong; try again");
                                break;
                   }            
            }
            else{
                System.out.println("Wrong; try again");
               // return;
            }
        System.out.println("Does " + " ( " + a + " || " + b + " || " + c + " ) " + "have the value true(t/T) or false(f/F)? ");                 // print out the question which asks for inputing the result of function 4
            
         input = myScanner.next();
            if (input.length () <2){
                char input4 = input.charAt(0);
               
                   switch (input4){
                   
                            case 'f':                                                                                                           // if the input is f or F, then compare false with r4
                            case 'F':    
                                if ( r4 == false){
                                    System.out.println ("Correct");
                                }
                                else{
                                    System.out.println("Wrong; try again");
                                 //   return;
                                }
                                break;
                                
                            case 't':                                                                                                           // if the input is t or T, then compare ture with r4
                            case 'T':
                                if ( r4 == true ){
                                    System.out.println ("Correct");
                                }
                                else{
                                    System.out.println("Wrong; try again");
                          //          return;
                                }
                                break;
                                     
                            default:                                                                                                            // if the input is other than t, T, f, F
                                System.out.println("Wrong; try again");
                                break;
                   }            
            }
            else{                                                                                                                               // if the input is more than one letter
                System.out.println("Wrong; try again");
              //  return;
            }
    }
}