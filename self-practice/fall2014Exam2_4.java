

import java.util.Scanner;
public class fall2014Exam2_4{
    public static void main (String[]args){
        System.out.println( sumPow() );
}

//288 (288 = 1 + 2*2 + 3*3*3 + 4*4*4*4 = 1 + 4 + 27 + 256) n=4
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
                sum += Math.pow((y) , (y));   // sum = 0 + 1 + 4 + 27 + 256 = 288
            }
        }

        //288 (288 = 1 + 2*2 + 3*3*3 + 4*4*4*4 = 1 + 4 + 27 + 256) n=4
        for(int x=1; x<n; x++){                   
            a += " + " + (x + 1);      
            for(int y=0; y<x; y++){    // a = 1 + 2*2 + 3*3*3 + 4*4*4*4
                a += "*" + (x + 1); 
            }
        }

        //288 (288 = 1 + 2*2 + 3*3*3 + 4*4*4*4 = 1 + 4 + 27 + 256) n=4
        for(int x=1; x<n; x++){                              
            b += " + " + (int)(Math.pow((x + 1),(x + 1)));      // b = 1 + 4 + 27 + 256
        }
        
        //288 (288 = 1 + 2*2 + 3*3*3 + 4*4*4*4 = 1 + 4 + 27 + 256) n=4
        c = sum + " (" + sum + " = " + a + " = " + b + ")";
        return c;
    }
    
  

}
}   

