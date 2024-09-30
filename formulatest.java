import java.util.Scanner;
public class formulatest {
   public static void main(String [] args) {
   
   Scanner scan = new Scanner(System.in) ;
      double kilometres = 100 ;
   
   System.out.print("Please enter the litres of petrol in the tank : ") ;
      double fuelintank = scan.nextDouble() ;
   
   System.out.print("Please enter the fuel efficiency in kilometre per litre : ") ;
      double fuelefficiency = scan.nextDouble() ;
   
   System.out.print("Please enter the price of petrol per litre : ") ;
      double priceperlitre = scan.nextDouble() ;
   
   
       double cost = (kilometres / fuelefficiency * priceperlitre) ;
       double distance = fuelintank * fuelefficiency ;   
   
            System.out.printf("The cost per 100 kilometres are RM" + "%.2f\n", cost) ;
            System.out.println("The car can go with the petrol in the tank are " + distance + "km") ;


      }
}

   
   
 