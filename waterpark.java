import java.util.Scanner;
   public class waterpark {
   public static void main(String[] args) {
   
      
      Scanner scan = new Scanner(System.in) ;
      double price,type,total,tendered,age,balance ;
      price=0;
      
      System.out.println("-----WELCOME TO LEGOLANDS THEME PARK-----\n") ;
      System.out.println("Choose type of ticket for visitor ") ;
      System.out.println("*********************************************") ;
      System.out.println("1: ONE DAY COMBO TICKET(THEME PARK + WATER PARK)") ;
      System.out.println("2: ONE DAY THEME PARK TICKET") ;
      System.out.println("3: ONE DAY WATER PARK TICKET") ;
      System.out.println("*********************************************") ;
      
      System.out.print("Type : ") ;
      type = scan.nextDouble() ;
      
      System.out.print("Age of visitor: ") ;
      age = scan.nextDouble() ;
      
      
      
      if (age >=3 && age<=11)
      {
         if (type == 1) 
            price = 156 ;
            
         else if (type == 2) 
            price = 124 ;
            
         else if (type == 3)
            price = 84 ;
      }
      
      else if(age >=12 && age <=59)
       {
         if (type == 1) 
            price = 196 ;
            
         else if (type == 2)
            price = 156 ;
            
         else if (type == 3) 
            price = 100 ;
      }
      
      else 
         price = 0 ;
      
      
      if (price > 0)
      {
      System.out.println("The total ticket price is RM " + price) ;
      
      System.out.print("Enter amount tendered: ") ;
      tendered = scan.nextDouble() ;
      
      balance = tendered - price ;
      System.out.println("Your balance is RM " +  balance) ;
      
      
      System.out.print("\n----------------- ") ;
      }
      
      else{
         System.out.println("Free Ticket");
         System.out.print("---------THANK YOU & ENJOY YOUR TIME!-------- ");
      }
   }
}