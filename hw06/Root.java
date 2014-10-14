//hw06
//The bisection method is a very simple way to compute the square root of a number.


import java.util.Scanner;

public class Root{
    public static void main(String[]args){
    
        Scanner scan = new Scanner (System. in);
        System.out.print("Enter a positive double number- ");
        if (scan.hasNextDouble()){                                              // if the input is a double
            double x = scan.nextDouble();
            
            if (x>0){                                                           // if the input is positive
                double high = x +1;
                double low = 0;
                double middle = high/2;
                while((high-low)>(0.0000001*( x +1))){                          // the while loop will operate until the difference between high and low is less than 0.0000001*(x+1), 
                    
                    if ( middle * middle > x){                                  // if middle*middle is greater than input, we assign middle to be the new high
                        high = middle;
                    }
                    else{                                                       // if middle*middle is less than input, we assign middle to be the new low
                        low = middle;
                    }
                    middle = (high + low)/2;                                    //reassign middle as the average of high and low
                }
                middle = (double) (middle * 10000000) / 10000000; 
                System.out.println("The square root of input is " + middle );
            }
            else{                                                               // if the input is not positive
                System.out.println("Input was not positive.");
                return;
            }
        }
        else{                                                                   // if the input is not a double
            System.out.println("Input was not a double");
            return;
        }
    }
}