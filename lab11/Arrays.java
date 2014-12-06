// Yutong Song
// 11.06.2014

import java.util.Scanner;
public class Arrays{
    public static void main(String []  args){
    
    System.out.print("Enter 10 ints- ");
        Scanner scan = new Scanner (System.in);
        int[] myList = new int[10];
        
	       for (int i=0; i<myList.length; i++){
	            myList[i] = scan.nextInt();}
	            
           int sum = 0;
	       for (int i=0; i<myList.length; i++){
	           sum += myList[i];
	       }
	       System.out.println("The sum is " + sum);

	        int min = myList[0];
	        for (int i=0; i<myList.length; i++){
                 if (myList[i] < min) 
                 min = myList[i];
	        }     
            System.out.println("The lowest entry is " + min);

	        int max = myList[0];
	        for (int i=0; i<myList.length; i++){
                if (myList[i] > max) 
                max = myList[i];
	        }    
            System.out.println("The highest entry is " + max);
        
                
            for (int i=0; i<myList.length; i++){
            System.out.println(myList[i] + " " + myList[9-i]);    
            }
    }
}