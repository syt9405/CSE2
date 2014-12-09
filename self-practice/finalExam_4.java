
import java.util.Scanner;
public class finalExam_4{
    public static void main(String[]args){

String s = "This is a string. It is full of chars.";
char [] array = stringToChars (s);

for (int i=0; i< array.length; i++){
    System.out.print(array[i]);
    }
    System.out.println();
    
}

public static char [] stringToChars (String s){
    
    int k=0;
    for(int i=0; i<s.length(); i++){
        switch (s.charAt(i)){
            case ' ': k++;break;
            case '.': k++; break;
        }
    }
    char [] array = new char [s.length()-k];
    int j=0;
    for( int i=0; i<s.length(); i++){
        switch (s.charAt(i)){
            case ' ': j++;break;
            case '.': j++;break;        
            default: array[i-j] = s.charAt(i);
        }
    }
    
    return array;






    }    
}