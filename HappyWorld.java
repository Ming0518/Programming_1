import java.util.Scanner;
   public class HappyWorld {
   public static void main(String[] args) {
   
      
      Scanner scan = new Scanner(System.in) ;
      double price,duration,lawyer, interest ;
      lawyer = 0 ;
      interest = 0 ; 
      char staff ;
      
      System.out.println("------------------------------");
      System.out.println("BIMBI BANK LOAN CALCULATOR") ;
      System.out.println("------------------------------");
      
      System.out.print("House Price : RM ");
      price = scan.nextDouble() ;
      
      System.out.print("Duration (in years) : ");
      duration = scan.nextDouble() ;
      
      scan.nextLine();
      
      System.out.print("House Type [Terrace/Semi-D/Bungalow] : ");
      String type = scan.nextLine() ;
      
      
      
      if (type.equals("Terrace"))
      {
      lawyer=8000;
      }
      else if (type.equals("Semi-D"))
      {
      lawyer =12000;
      }
      else
      {
      lawyer=15000;
      }
      
      System.out.print("Government (G)/Private(P): ");
      staff = scan.next().charAt(0) ;
       
       if (staff == 'G')
      {
      interest = 4 ;
      }
      else if (staff == 'P')
      {
      System.out.print("Enter annual interest: ");
      interest = scan.nextDouble() ;
      }
      
      
      double loan = price + lawyer ;
      double monthinterest = interest/(12*100) ;
      double durationloan = duration * 12 ;
      double payment = loan * (monthinterest/(1-Math.pow((1+monthinterest),-durationloan))) ;
      
      System.out.println(loan) ;
      System.out.println(monthinterest) ;
      System.out.println(durationloan) ;
      System.out.println(payment) ;
      
      /*System.out.println("Your Loan Information ");
      System.out.println("******************************");
      
      System.out.printf("Montly Payment : RM%.2f", payment);
      
      System.out.println("\n******************************");*/
      
      
   }
}