//Yutong Song
//CSE002
//objective: You should use loops to create each of the three stacks of number. The first stack should be created only using for loops. The second stack should be created only using while loops. The third stack should be created only using do-while loops. Start by writing a program that prints the first stack and get it running. Then it is straightforward to modify a copy of that code (which uses for loops) to write code that uses only while loops. Once you have code that generates the top two stacks you can easily modify the code to generate the third diamond that only uses do-while loops.
//10/19/2014


import java.util.Scanner;
public class NumberStack{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 9- "); //input value
        int input = scan.nextInt();
        
        System.out.println("Using for loops:");      
        for(int n=1; n<=input; n++){                 //control how many blocks repeating
            for(int i=0; i<n; i++){                  //control how many lines repeating
                for(int k=(input-n); k!=0; k--){
                    System.out.print(" ");
                }
                for(int j=0; j<(2*n-1); j++){             //control how many times number repeating
                    System.out.print(n);
                }
            System.out.println();
            }
            for(int k=(input-n); k!=0; k--){
                System.out.print(" ");
            }
            for(int a=0; a<(2*n-1); a++){                  //control how many dashes in a line
                System.out.print("-");
            }
        System.out.println();
        }
            
        
        
        
        System.out.println("Using while loops:");
        int n=0;
        while (n<=input){                            // control how many blocks repeating
            int i=0;
            while (i<n){                             //control how many lines repeating
                int k=input-n;
                while(k!=0){
                    System.out.print(" ");
                    k--;
                }
                int j=0;
                while (j<(2*n-1)){                         //control how many numbers in a line repeating 
                    System.out.print(n);
                    j++;
                }
                System.out.println();
                i++;
            }
            
            int k=input-n;
            while(k!=0){
                System.out.print(" ");
                k--;
            }
            int a=0;                                 //control how many dashes in a line at the end
            while (a<(2*n-1)){
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
                int k=input-n;
                while(k!=0){
                    System.out.print(" ");
                    k--;
                }
                while (j<(2*n-1)){                         //control how many numbers in a line repeating 
                    System.out.print(n);
                    j++;
                }
                System.out.println();
                i++;
            }
            int k=input-n;
            while(k!=0){
                System.out.print(" ");
                k--;
            }
            int a=0;                                 //control how many dashes in a line at the end
            while (a<(2*n-1)){
                System.out.print("-");
                a++;
            }
            System.out.println();
            n++;
        } while(n<=input);                           //control how many repeating blocks
            
        
        
    
}   
}


// line 132 causes error
/*
import java.util.Scanner;
public class exam2b{
   public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 9- ");
        String n = scan.next();
        while(true){
            if(!scan.hasNextInt()){
                System.out.print("Enter a number between 1 and 9- ");
                n = scan.next();
            }
            else{
            if (scan.nextInt() > 9 || scan.nextInt() < 1){
                System.out.print("Enter a number between 1 and 9- ");
                n = scan.next();
            }
                n = scan.nextInt();
            }
        }    

        int i,j,k,x,y,z;
        for(i=1; i<=n; i++){
            for (k=0; k<i; k++){
                for (y=0; y<(n - i); y++){
                    System.out.print(" ");
                }
                for (j=0; j<(2*i-1); j++){
                    System.out.print(i);
                }
            System.out.print("\n");    
            }
            for (z=0; z<(n-i); z++){
                System.out.print(" ");
            }
            for (x=0; x<(2*i-1); x++){
                System.out.print("-");
            }
        System.out.print("\n");
        }
    }
}

*/