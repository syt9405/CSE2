// Yutong Song
// CSE002 lba09
// 10.24.2014

import java.util.Scanner;
public class Methods{
    
  public static void main(String[]arg){
	Scanner scan=new Scanner(System.in);
	String input;
	
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
    String statement;               	
    if (a >= b && b >= c){
        statement = "true";
    }
    else{ 
        statement = "false";
    }
	System.out.println("It is "+ statement +" that "+a+", "+b+", and "+c+" are in ascending order");
  }

  
    public static int larger(int num1, int num2){
        int result;
        if (num1>num2){
            result = num1;
        }
        else{
            result = num2;
        }
        return result;
    }        
    
    public static int getInt(Scanner scan){
        while (scan.hasNextInt() == false){
            System.out.println("You did not enter an int; try again- ");
            scan.next();
        }
        return scan.nextInt();
    }   
}