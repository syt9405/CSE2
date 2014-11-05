import java.util.Scanner;
public class exam2{

   public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
            do{
                int a;
                System.out.print("Enter an int- ");
                scan.next();
                if(scan.hasNextInt()){
                    if(scan.nextInt()>0){
                        a = scan.nextInt();
                        Sumsq(a);
                    }
                    else{
                        break;
                    }
                }
                else{
                    break;
                }
            }while(scan.nextInt()>0);
     }

   public static void Sumsq(int a){
       int i, sum=0;
       for (i=1; i<=a; i++){
           sum = sum + i*i;
       }
       System.out.println("The sum of 1+2*2+3*3+....+n*n for n = "+a+" is "+sum);

   }

}