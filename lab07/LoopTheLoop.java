import java.util.Scanner;
public class LoopTheLoop{
  public static void main(String[]args){
    
    Scanner scan = new Scanner(System.in);
    boolean run = true;
    String wRepeat = "";
    while(true){
      System.out.println("Enter an int between 1 and 15 ");
      if(scan.hasNextInt()){
        int input = scan.nextInt();
        if(input>=1 && input<=15){
          
          int x=1;
          while(x<=input){
            System.out.print("*");
            x++;
          }
          System.out.print("\n");
          
          x=1;
          while (x<=input){
            int n=1; //the number of stars in a row
            while(n<=x){
              System.out.print("*");
              n++;
            }
            System.out.print("\n");
            x++;
          }
        }           
        else{
          System.out.println("Your int was not in the range [1.15]");
          return;
        }
      }         
      else{
        return;
      }
      
      System.out.println("Enter y or Y to go again- ");
      wRepeat = scan.next();
      if (!wRepeat.equals ("y") && !wRepeat.equals ("Y")){    
        break;  
      }   
    }  
  }
}