/*Yutong Song
Hw09
Objectives.  This homework is designed to give you practice designing a nested sequence of method calls that divide a larger problem into subproblems. 
Addressing large problems in terms of subproblems allows you to 
(1) create a modular program where each module addresses one subproblem.  
Later, when you discover better solutions to a particular subproblem, you can 
(2) substitute the module without having to worry about the correctness of the rest of your code.  
The advantages of design principles (1) and (2) permit code to be written by multiple people at the same time without wasting time accidentally doing someone else’s part.
	To keep this program practical, very simple problems are treated as “subproblems”. 
	In a professional environment, such simple problems would never be divided between different programmers because they are professionals and this isn’t that hard.  
	The point here is to see how modularity can be created, even though the modules in this program are small, for demonstration purposes.
*/

import java.util.Scanner;
    public class BlockedAgain{
    public static void main(String []s){
int m;
//force user to enter int in range 1-9, inclusive.
m = getInt(); 
allBlocks(m);
}



// check whether the input is acceptible
public static int getInt(){
    int a;
    System.out.print("Enter an in int between 1 and 9, inclusive: ");
    a=checkRange(checkInt());
    return a;
}

public static int checkInt(){                                  // check the input is a integer
    Scanner scan = new Scanner(System.in);
    int intValue=0;
    if(scan.hasNextInt()){                                     // if the input is an integer, then return the input as inValue
        intValue = scan.nextInt();
    }
    else{                                                      // if the initial input is not an integer, then enter the while loop to ask for new inputs until getting an valid input
        while (!scan.hasNextInt()){
        System.out.print("You did not enter an int; try again: ");
        scan.next();
    }
    intValue = scan.nextInt();
    }
    return intValue;                                            // return intValue
}

public static int checkRange(int x){                            //check if hte input is in the range of 1 to 9
    Scanner scan = new Scanner(System.in);
    int value=x;
    if(value>=1 && value<=9){                                   //if the input is valid, return value
       return value;
    }
    else{                                                       //if the input is not inside the range, enter the while loop to ask new inputs until getting a valid input
       while(value<1 || value>9){
       System.out.print("You did not enter an int in [1,9]; try again: ");
       value = scan.nextInt();
        }
    }
    return value;                                               // return value
}



// printing stack of "blocks"
public static void allBlocks(int m){
    for(int n=0; n<=m; n++){                         //control how many blocks repeating
        block(n,m);
        line(n,m);
    }
}    
    
    
public static void block(int n, int m){
    for(int i=0; i<n; i++){                          //control how many lines repeating
        for(int k=(m-n); k!=0; k--){                 //control how many spaces before printing out numberss
            System.out.print(" ");
        }
        for(int j=0; j<(2*n-1); j++){                //control how many times number repeating
            System.out.print(n);
        }
        System.out.println();
    }
    
}    
   
   
public static void line(int n, int m){
    for(int k=(m-n); k!=0; k--){                      //control how many spaces before printing out dashes
        System.out.print(" ");
            }
            for(int a=0; a<(2*n-1); a++){             //control how many dashes in a line
            System.out.print("-");
            }
            System.out.println();
  }  
    
}



