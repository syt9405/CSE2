//objective: You should use loops to create each of the three stacks of number. The first stack should be created only using for loops. The second stack should be created only using while loops. The third stack should be created only using do-while loops. Start by writing a program that prints the first stack and get it running. Then it is straightforward to modify a copy of that code (which uses for loops) to write code that uses only while loops. Once you have code that generates the top two stacks you can easily modify the code to generate the third diamond that only uses do-while loops.
//10/19/2014


import java.util.Scanner;
public class NumberStack{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 9- "); //input value
        int input = scan.nextInt();
        
        System.out.println("Using for loops:");      
        for(int n=0; n<=input; n++){                 //control how many blocks repeating
            for(int i=0; i<n; i++){                  //control how many lines repeating
                for (int j=0; j<n; j++){             //control how many times number repeating
                    System.out.print(n);
                }
                System.out.println();
            }
            for(int a=0; a<n; a++){                  //control how many dashes in a line
            System.out.print("-");
            }
            System.out.println();
        }    
        
        
        System.out.println("Using while loops:");
        int n=0;
        while (n<=input){                            // control how many blocks repeating
            int i=0;
            while (i<n){                             //control how many lines repeating
                int j=0;
                while (j<n){                         //control how many numbers in a line repeating 
                    System.out.print(n);
                    j++;
                }
                System.out.println();
                i++;
            }
            int a=0;                                 //control how many dashes in a line at the end
            while (a<n){
                System.out.print("-");
                a++;
            }
            System.out.println();
            n++;
        }
        
        
        
        System.out.println("Using do-while loops:");
        n=0;
        do{   
            int i=0;
            while (i<n){                             //control how many lines repeating
                int j=0;
                while (j<n){                         //control how many numbers in a line repeating 
                    System.out.print(n);
                    j++;
                }
                System.out.println();
                i++;
            }
            int a=0;                                 //control how many dashes in a line at the end
            while (a<n){
                System.out.print("-");
                a++;
            }
            System.out.println();
            n++;
        } while(n<=input);                           //control how many repeating blocks
            
        
        
    
}   
}

