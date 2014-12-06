//Yutong Song
// hw11 part 2


public class MatrixSorter{
  public static void main(String arg[]){    
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }


    public static int [][][] buildMat3d(){                                      // recall method to build a triangle array
        int [][][] triangleArray = new int [3][][];
            
            for (int i=0; i<3; i++){                                            // three slabs total
                triangleArray[i] = new int [(i*2)+3][];
                for(int j=0; j<((i * 2)+ 3); j++){                              // number of rows
                    triangleArray[i][j] = new int [i+j+1];
                    for(int k=0; k<(i + j + 1); k++){                           // number of columns
                        triangleArray[i][j][k] = (int)(Math.random()*99+1);     // give each space a random integer 1-99
                    }    
                }
            }
        return triangleArray;    
    }
    
    
    public static void show(int [][][] triangleArray){
        for (int i=0; i<triangleArray.length; i++){                             // number of blocks
            System.out.println("---------------------------Slab " + (i + 1));
            for(int j=0; j<triangleArray[i].length; j++){                       // number of rows
                for(int k=0; k<triangleArray[i][j].length; k++){                // number of columns
                    System.out.print(triangleArray[i][j][k] + " ");
                }
            System.out.println("");
            }
        }
        System.out.println("-------------------------");
    }
    
    
    public static int findMin (int [][][] triangleArray){
        int tempMin = triangleArray[0][0][0];                                   // store triangleArray[0][0][0] to a temperary int
        
            for (int i=0; i<3; i++){
                for(int j=0; j<(i * 2 + 3); j++){
                    for(int k=0; k<(i + j + 1); k++){
                        if(triangleArray[i][j][k] < tempMin){
                            tempMin = triangleArray[i][j][k];                   // find the smallest value
                        }
                    }    
                }
            }
        return tempMin;
    }
    
    public static int [][] sort (int [][] triangleArray){   
        for (int l=0; l<triangleArray.length; l++){                             // using selective sort to sort each row
            for (int i=0; i<triangleArray[l].length-1; i++){
                int currentMin = triangleArray[l][i];
                int currentMinIndex = i;
                for (int j=i+1; j<triangleArray[l].length; j++){
                    if (currentMin > triangleArray[l][j]){
                        currentMin = triangleArray[l][j];
                        currentMinIndex = j;
                    }
                }
                if (currentMinIndex !=i)    {
                    triangleArray[l][currentMinIndex] = triangleArray [l][i];
                    triangleArray[l][i] = currentMin;
                }
            }
        }

        for (int i=1; i< triangleArray.length; i++){                            // using insertive sort to sort columns of slab 3
            int currentMin[] = triangleArray[i];
            int j;
            for (j= i - 1; j >= 0 && triangleArray[j][0] > currentMin[0]; j--){
                triangleArray[j + 1] = triangleArray[j];
            }
            triangleArray[j + 1] = currentMin;
        }
        return triangleArray;    
    }
    
}    
                
                
                
                
                
    