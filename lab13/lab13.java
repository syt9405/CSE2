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
    }
}

for (int row = 0; row <5 ; row++) {
    for (int column = 0; column < (row *3 + 5); column++) {
        System.out.print(triangleArray[row][column] + " ");
    }
    System.out.println("");
}

for (int row = 0; row < 5; row++){
    for (int x = 0; x < (row *3 + 5); x++) {
        for (int y = x + 1; y < (row *3 + 5); y++){
        if(triangleArray[row][x] > triangleArray[row][y]){
            int temp = triangleArray[row][x];
            triangleArray[row][x] = triangleArray[row][y];
            triangleArray[row][y] = temp;
        }
        }
    }
}

System.out.println("");
System.out.println("The array after sorting");
for (int row = 0; row < 5; row++) {
    for (int column = 0; column < (row *3 + 5); column++) {
    System.out.print(triangleArray[row][column] + " ");
    }
System.out.println();
}

}
     
}
