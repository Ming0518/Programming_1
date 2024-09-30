import java.util.Scanner;
public class Task2 {
   public static void main(String [] args) {
   
   System.out.println("**** Pizaa House ******\n") ;
   
   Scanner scan = new Scanner(System.in) ;
   System.out.print("Please enter the price of the meal : ") ;
   double price = scan.nextDouble() ;
   
   double tax = 0.0825 ;
   double salestax = price * tax ;
   
   System.out.print("\nPrice of meal : " + price ) ;
   
   System.out.printf("\nSales Tax : %.2f", salestax) ;
   
   System.out.println("\n----------------------") ;
   
   double amount = price + salestax ;
   System.out.printf("Amount : %.2f\n",  amount) ;
   
   double discount, totaldiscount, finalamount ;
   
   
   
   
   if (amount >= 100 && amount <=200 ) 
   {
   discount = 0.05 ;
   totaldiscount = amount * discount ;
   System.out.printf("Total Disount :%.2f ", totaldiscount ) ;
   } 
   
   
   else if (amount < 100)
   {
   discount = 0 ;
   totaldiscount = amount * discount ;
   System.out.printf("Total Disount :%.2f ", totaldiscount ) ;
   }
   
   else
   {
   discount = 0.1 ;
   totaldiscount = amount * discount ;
   System.out.printf("Total Disount :%.2f ", totaldiscount ) ;
   }
   
   
   System.out.println("\n----------------------") ;
   
   finalamount = amount - totaldiscount ;
   System.out.printf("Total Amount :%.2f\n ", finalamount );
   
   System.out.print("\nEnter amount tendered : RM") ;
   double tendered = scan.nextDouble() ;
   
   System.out.println("\nAmount tendered : RM" + tendered) ;
   
   System.out.printf("Total Amount : %.2f\n",  finalamount) ;
   
   System.out.println("----------------------") ;
   
   double change = tendered - finalamount ;
   System.out.printf("Change Cash: RM%.2f\n", change) ;

   System.out.println("\n**** Thank You******") ;

   
   }
}