import java.util.Scanner;
public class exam2b{
   public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 9- ");
        int n=0;

            if(scan.hasNextInt()){
                n = scan.nextInt();
                if (n <= 9 && n >=1){
                    n = scan.nextInt();
                }
                else{
                    while(n > 9 || n < 1){
                        System.out.print("Enter a number between 1 and 9- ");   
                        scan.next();
                    }    
                }
            }
            else{
                while(!scan.hasNextInt()){
                System.out.print("Enter a number between 1 and 9- ");
                scan.next();
                }
            }
            n = scan.nextInt();
        }

        int i,j,k,x,y,z;
        for(i=1; i <= n; i++){
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