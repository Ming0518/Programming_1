import java.util.Scanner;
   public class ArrayTwoDimension{
      public static void main(String [] args) {
      
      Scanner scan = new Scanner(System.in);
      
      int matrix[][] = new int [7][6];
      
      for (int row = 0; row < matrix.length; row++)
         for (int col = 0; col < matrix[row].length; col++)
            matrix[row][col] = scan.nextInt();

      
      
      }
}