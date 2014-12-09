public class finalExam_5{
    public static void main(String[]args){
        String []stars;
        stars = starry[10];
         for(int i=0; i<10; i++){
             System.out.println(stars[i]);
         }
    }
    
    public static String [] starry( int n){
        String [] array = new String [n];
        for( int i=0; i<5; i++){
            for (int j=0; j<i && j<5;j++ ){
                array[j] += "" + j;
            }
        }
        
        for( int i=0; i<5; i++){
            for ( int j=5; j<9; j++){
                array[j] += "" + j;
            }
        }
        for ( int j=0; j<10; j++){
            array[j] += "*";
        }
        return array;
        

        
        
        
        
        
        
        
        
        
        
    }
}


