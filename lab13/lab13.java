import java.util.Scanner;

 public class lab13 {
 public static void main(String[] args) {

 Scanner input = new Scanner(System.in);

int[][] triangleArray = new int [5][];
triangleArray[0] = new int[5];
triangleArray[1] = new int[8];
triangleArray[2] = new int[11];
triangleArray[3] = new int[14];
triangleArray[4] = new int[17];

System.out.println("The array before sorting");
for (int row = 0; row <5 ; row++) {
    for (int column = 0; column < (row *3 + 5); column++) {
        triangleArray[row][column] = (int)(Math.random()*40);
        System.out.print(triangleArray[row][column] + " ");
    }
    System.out.println("");
}


for (int row = 0; row < 5; row++){
    for ( int newRow = row + 1; newRow < 5; newRow++){
        if(triangleArray[row][0] > triangleArray[newRow][0]){
            int [] temp = triangleArray[row];
            triangleArray[row] = triangleArray[newRow];
            triangleArray[newRow] = temp;
        }
    }
}


System.out.println("");
System.out.println("The array after sorting");
for (int row = 0; row < triangleArray.length; row++) {
    for (int column = 0; column < triangleArray[row].length; column++) {
    System.out.print(triangleArray[row][column] + " ");
    }
System.out.println();
}

}
     
}
