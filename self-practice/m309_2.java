//Yutong Song
//309 extra credit project
//#2

public class m309_2{
    public static void main(String[]args){
        int ndie = 0;
        int counts = 0;
        boolean[] isCovered = new boolean[6];
        boolean allCovered = false;
        
        for(int i = 0; i<6; i++){                   // set the array isCovered[i] to be false (original setting)
            isCovered[i] = false;
        }
        
        int index = 0;
        for(int x=0; x <2000; x++){                 // repeat the process 2000 times
            allCovered = false;
            counts = 0;
            for(int i = 0; i<6; i++){               // for every repeat, we reset the array back to be false
                isCovered[i] = false;
            }
            
            while (!allCovered){                    // if the array is not true
                ndie = (int)(Math.random()*6);      // we random a new integer in the range 0-5
                isCovered[(ndie)] = true;           // change the corresponding array space to be true
                counts++;                           // increase the time of repeats by one
                
                for(int i = 0; i < 6; i++){         // if all spaces in the array are false, then we assign allCovered to be false
                    if (isCovered[i] == false) {                
                        allCovered = false; 
                        break;
                    }
                        allCovered = true;          // otherwise, allcovered is true
                }
            }
            System.out.println(counts + " ");        //print out the number of times that the loop repeats
        }    
    }
}


/* For this program, the main purpose is to determine how many times do we need to roll a fair die in order to 
appear all 6 numbers at least once. My method is using an array. First, I set the Array isCovered[i] to be all
false. Then, using Math.random to get random integers from 0-5, matching them with array isCovered[i]. If the 
number has come up once, then the matching array [i] change from false to true. when the whole array change to
true, then we output the number of total rolling time. Repeat the whole process 2000 times and collect data.

Then, I ploted all data into Matlab and graph them.
*/