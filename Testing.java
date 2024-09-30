import java.util.Scanner;
   public class Testing {
      static Scanner scan = new Scanner(System.in) ;
         public static void main(String args []) {
         
         System.out.print("Enter a word :");
         String name = scan.nextLine();
         
         String water = "water";
         
         if(name.equals(water))
            System.out.print("Same");
         
         else
            System.out.print("Not Same");     
         }
}