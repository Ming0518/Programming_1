import java.util.Scanner;
public class ScannerTest {
   public static void main(String [] args) {
   
   Scanner scan = new Scanner(System.in) ;
   
   System.out.print("Please enter the value of A : ") ;
   String name = scan.nextLine() ;
   
  System.out.print("Please enter the value of B : ") ;
   int numberB = scan.nextInt() ;
   
   System.out.print("Please enter the value of C : ") ;
   int numberC = scan.nextInt() ;
   
   int max = Math.max(Math.max(numberA,numberB),numberC);
   
   
   System.out.println("The biggest number among the three number are " + max ) ;
   
   }
}
