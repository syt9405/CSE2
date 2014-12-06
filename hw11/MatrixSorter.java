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


    public static int [][][] buildMat3d(){         
        int [][][] triangleArray = new int [3][][];
            
            for (int i=0; i<3; i++){
                triangleArray[i] = new int [(i*2)+3][];
                for(int j=0; j<((i * 2)+ 3); j++){
                    triangleArray[i][j] = new int [i+j+1];
                    for(int k=0; k<(i + j + 1); k++){
                        triangleArray[i][j][k] = (int)(Math.random()*99+1);
                    }    
                }
            }
        return triangleArray;    
    }
    
    
    public static void show(int [][][] triangleArray){
            for (int i=0; i<triangleArray.length; i++){
                System.out.println("---------------------------Slab " + (i + 1));
                for(int j=0; j<triangleArray[i].length; j++){
                    for(int k=0; k<triangleArray[i][j].length; k++){
                        System.out.print(triangleArray[i][j][k] + " ");
                    }
                System.out.println("");
                }
            }
        System.out.println("-------------------------");
    }
    
    
    public static int findMin (int [][][] triangleArray){
        int tempMin = triangleArray[0][0][0];
        
            for (int i=0; i<3; i++){
                for(int j=0; j<(i * 2 + 3); j++){
                    for(int k=0; k<(i + j + 1); k++){
                        if(triangleArray[i][j][k] < tempMin){
                            tempMin = triangleArray[i][j][k];
                        }
                    }    
                }
            }
        return tempMin;
    }
    
    public static int [][] sort (int [][] triangleArray){
        for (int l=0; l<triangleArray.length; l++){
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

        for (int i=1; i< triangleArray.length; i++){
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
                
                
                
                
                
    