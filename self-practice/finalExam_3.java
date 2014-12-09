
import java.util.Scanner;
public class finalExam_3{
    public static void main(String[]args){

        int []x={1,2,3,4,5};
        int []y={7,8,9,10};
        y=x;
        x=y;
        print(x);
        print(y);
    }
public static void print(int [] x){
	for(int j=0;j<x.length;j++)
		System.out.print(x[j]+"  ");
		System.out.println();
	}


}











        
