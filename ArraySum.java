import java.util.Scanner;
   public class ArraySum{
      public static void main(String [] args) {
   
         Scanner scan = new Scanner(System.in) ;
         
         /*int row, col ;
         int[][] matrix = new int [2][3];
         for(row = 0; row < matrix.length; row++)
            for(col = 0; col < matrix[row].length; col++)
               matrix[row][col] = 10 ;*/
               
         final int CAR_TYPES = 5;
         final int COLOR_TYPES = 6;
         
         double[][] sales = new double[CAR_TYPES][COLOR_TYPES];

               
	Scanner in = new Scanner(System.in);
   
   double sum = 0;
	for (int row = 0; row<sales.length; row++)
	   for (int col=0; col<sales[row].length; col++) {
		 System.out.print("Enter Price : ");
         sales[row][col] = scan.nextDouble() ;
            sum = sum + sales[row][col];
	   }
      
	   System.out.println(sum);


               

        
   }
}