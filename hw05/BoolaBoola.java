// Yutong Song
// 9/28/2014
// hw05 BoolaBoola.java
// Write a program that has three boolean variables to each of which the value of true or false is randomly assigned. Then, at random, combine the three variables with random choices of && and || and stores the result. For example, one might have the expression true && false || true (there are 32 possible expressions, so I will not list all the possibilities). The program should then present the expression to the user and ask the user to state the result of of the expression. 

import java.util.Scanner;

public class BoolaBoola{
    public static void main(String[]args){
        
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        boolean a=(Math.random()<0.5);       // dsfhhiuohfewqkbcui
        boolean b=(Math.random()<0.5);       //jaouihp;iucqh
        boolean c=(Math.random()<0.5);    //njscohdwuh;o
        
        boolean r1 = (a && b && c),
                r2 = (a && b || c),
                r3 = (a || b && c),
                r4 = (a || b || c);
                
        
       
        System.out.println("Does " + "( " + a +  " && " +  b + " && " + c +" ) " + "have the value true(t/T) or false(f/F)? ");
            
            String input = myScanner.next();
            if (input.length () <2){
                char input1 = input.charAt(0);
               
                   switch (input1){
                   
                            case 'f':
                            case 'F':    
                                if ( r1 == false){
                                    System.out.println ("Correct");
                                }
                                else{
                                    System.out.println("Wrong; try again");
                                    // return;
                                }
                                break;
                                
                            case 't':
                            case 'T':
                                if ( r1 == true ){
                                    System.out.println ("Correct");
                                }
                                else{
                                    System.out.println("Wrong; try again");
                                    //return;
                                }
                                break;
                                     
                            default:
                                System.out.println("Wrong; try again");
                                break;
                   }            
            }
            else{
                System.out.println("Wrong; try again");
                //return;
            }
            
            
        System.out.println("Does " + " ( " + a + " && " + b + " || " + c + " ) " + "have the value true(t/T) or false(f/F)? ");
        
         input = myScanner.next();
            if (input.length () <2){
                char input2 = input.charAt(0);
               
                   switch (input2){
                   
                            case 'f':
                            case 'F':    
                                if ( r2 == false){
                                    System.out.println ("Correct");
                                }
                                else{
                                    System.out.println("Wrong; try again");
                                    //return;
                                }
                                break;
                                
                            case 't':
                            case 'T':
                                if ( r2 == true ){
                                    System.out.println ("Correct");
                                }
                                else{
                                    System.out.println("Wrong; try again");
                                    //return;
                                }
                                break;
                                     
                            default:
                                System.out.println("Wrong; try again");
                                break;
                   }            
            }
            else{
                System.out.println("Wrong; try again");
                }
            
        System.out.println("Does " + " ( " + a + " || " + b + " && " + c + " ) " + "have the value true(t/T) or false(f/F)? ");
          
         input = myScanner.next();
            if (input.length () <2){
                char input3 = input.charAt(0);
               
                   switch (input3){
                   
                            case 'f':
                            case 'F':    
                                if ( r3 == false){
                                    System.out.println ("Correct");
                                }
                                else{
                                    System.out.println("Wrong; try again");
                                    //return;
                                }
                                break;
                                
                            case 't':
                            case 'T':
                                if ( r3 == true ){
                                    System.out.println ("Correct");
                                }
                                else{
                                    System.out.println("Wrong; try again");
                                    //return;
                                }
                                break;
                                     
                            default:
                                System.out.println("Wrong; try again");
                                break;
                   }            
            }
            else{
                System.out.println("Wrong; try again");
               // return;
            }
        System.out.println("Does " + " ( " + a + " || " + b + " || " + c + " ) " + "have the value true(t/T) or false(f/F)? ");
            
         input = myScanner.next();
            if (input.length () <2){
                char input4 = input.charAt(0);
               
                   switch (input4){
                   
                            case 'f':
                            case 'F':    
                                if ( r4 == false){
                                    System.out.println ("Correct");
                                }
                                else{
                                    System.out.println("Wrong; try again");
                                 //   return;
                                }
                                break;
                                
                            case 't':
                            case 'T':
                                if ( r4 == true ){
                                    System.out.println ("Correct");
                                }
                                else{
                                    System.out.println("Wrong; try again");
                          //          return;
                                }
                                break;
                                     
                            default:
                                System.out.println("Wrong; try again");
                                break;
                   }            
            }
            else{
                System.out.println("Wrong; try again");
              //  return;
            }
    }
}