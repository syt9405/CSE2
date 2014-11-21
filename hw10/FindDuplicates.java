// Yutong Song
// 11/15/2014
// hw10



import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
     public static boolean hasDups(int [] x){                                   // return a boolean statement
      boolean a;
      for(int i = 0; i<10; i++){                       
          for(int j=(i + 1); j<10; j++){
              if( x[i] == x[j] ){                                               // check the array elements one by one. 
                  a = true;                                                     // if there are elements with same value
                  return a;                                                     // then return true. otherwise, return false
              }
          }
      }
      a = false;
      return a;
  }
  
  public static boolean exactlyOneDup(int [] num){                              // return a boolean statement on whether the array only contains one duplicate
    boolean x;
    int a=0;
    for(int i=0; i<10; i++){                                                    // sum up the total number of elements that ahve same values
        for(int j=1+i; j<10; j++){
            if (num[i] == num[j]){                               
                a++;
            }
        }
    }
    if(a == 1){                                                                 // if the sum equals to 1, then return true
        x = true;
    }
    else{                                                                       // otherwise, return false
        x = false;
    }
    return x;      
  }
}
