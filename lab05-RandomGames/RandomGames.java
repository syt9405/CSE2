// Yutong Song
// 9/26/2014
// lab05 RandomGames
// Objectives. This lab session is an exercise in using switch statements  and in using Math.random(), a random number generator. Although you could avoid the use of switch statements in this assignment by the (clumsy) use of if statements, you should not do so. Only use an if statement when you cannot use a switch statement tothe same purpose.

import java.util.Scanner;

public class RandomGames {
    public static void main(String[]args){
        
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
        
        String input = myScanner.next();
        if (input.length() == 1){
        
            char Letter = input.charAt(0);
            switch (Letter) {
                case 'R':
                case 'r':
                    int a=(int)(Math.random()*38);
                        switch (a){
                            case 37:
                                System.out.println("Roulette: 00");
                                break;
                            default :
                                System.out.println("Roulette:" + a);
                                break;
                        }  
                    break;    
                case 'C':
                case 'c':
                    System.out.println("Craps option is yet to be implemented");
                    break;
                case 'P':
                case 'p':
                    System.out.println("Picking a card not implemented yet");
                    break;
                default:
                    System.out.println("is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
                    break;
            } 
        }            
        else{
            System.out.println("a single character expected");
            return;
        }     
    }         
}             
             
             
              //  case 'C':
                //case 'c':
              //          int b = (int)(Math.random()*6)+1;
            //            int c = (int)(Math.random()*6)+1;
          //              int n = b + c;
        //                System.out.println("Craps: " + b + "+" + c + "=" + n);
      //                  break;
    //           
  //              case 'P': 
//                case 'p':
           //             int d = (int)(Math.random()*13)+1;
            //            int e = (int)(Math.random()*4)+1;
          //              
        //                switch (d) {
      //                      case 11:
    //                                String x = "Jack"; 
  //                                  break;
//                            case 12: 
                  //                  x = "Queen";
                //                    break;
              //              case 13: 
            //                        x = "King";
          //                          break;
        //                    default : 
      //                              x = d;
    //                                break;
  //                      }            
//                        switch (e) {
                   //         case 1: 
                 //                   String y = "hearts";
               //                     break;
             //               case 2: 
           //                         y = "diamonds";
         //                           break;
       //             /        case 3: 
                //                    y = "clubs";
                //                    break;
              //              default:
                  //                  y = "spades";
            //                        break;
           //             }
         //               System.out.println(x + " of " + y);
          //              break;
        //        default: 
      //                  System.out.println( nCard + " is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
      //                  break;
    //        }
  //      } 
//        else {
         //   System.out.println("a single character expected");
      ///      return;
    //    }
  //  }
//}