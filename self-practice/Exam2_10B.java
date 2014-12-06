

import java.util.Scanner;
public class Exam2_10B{
    public static void main (String[]args){
        String answer;
    do{
        System.out.println( sumPow() );
            System.out.print("Do you want to enter another int? Enter Y or y to continue, or other values to exit- ");
            Scanner scan = new Scanner(System.in);
            answer = scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
}


public static String sumPow(){   
    System.out.print("enter an int- ");
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int sum = 0;
    String a = "1", b = "1", c = "";
    
    
    if (n <= 0){
        return (sum + "");
    }
    
    else{
        //288 (288 = 1 + 2*2 + 3*3*3 + 4*4*4*4 = 1 + 4 + 27 + 256) n=4
        for(int x=1; x <= n; x++){          
            for (int y=x; y< (x + 1); y++){  
                sum += Math.pow((y) , (y)); 
            }
        }

        //288 (288 = 1 + 2*2 + 3*3*3 + 4*4*4*4 = 1 + 4 + 27 + 256) n=4
        for(int x=1; x<n; x++){                   
            a += " + " + (x + 1);      
                for(int y=0; y<x; y++){
                a += "*" + (x + 1);
                }
        }

        //288 (288 = 1 + 2*2 + 3*3*3 + 4*4*4*4 = 1 + 4 + 27 + 256) n=4
        for(int x=1; x<n; x++){                              
            b += " + " + (int)(Math.pow((x + 1),(x + 1)));      // b = 1 + 4 + 27 + 256
        }
        
        //288 (288 = 1 + 2*2 + 3*3*3 + 4*4*4*4 = 1 + 4 + 27 + 256)
        c = sum + " (" + sum + " = " + a + " = " + b + ")";
        return c;
    }
    
  

}
}   

