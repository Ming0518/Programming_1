import java.util.Scanner;
   public class Assignment1{
      public static void main(String [] args) {
   
         Scanner scan = new Scanner(System.in) ;
         
         double Package = 4399, offer = 599, discount, totalprice, InterestRate, payment, deposit, duration, amount ;
            
            
            System.out.println("THE TOTAL PRICE OF THE PACKAGE ARE RM4399") ;
            System.out.println("----------------------------------------------") ;    
            System.out.println("Enter (c) if you want to pay with cash") ;
            System.out.println("Enter (i) if you want to pay with installment") ;
            System.out.println("----------------------------------------------") ;
      
            System.out.print("Please enter (c) or (i) : ") ;
               char type1 = scan.next().charAt(0) ;
            System.out.println("----------------------------------------------") ;
            
            if(type1 == 'c'){
               discount= Package - (Package * 0.05) ;
            
                  System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！") ;
                  System.out.println("| Offered : AirPods for only RM599 |") ;
                  System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！") ;
                  
                  System.out.println("\nEnter (y) if you want to accepts the offer") ;
                  System.out.println("Enter (n) if you dont want to accepts the offer") ;
                  System.out.println("---------------------------------------------") ;
            
               System.out.print("Please enter (y) or (n) : ") ;
                   char type2 = scan.next().charAt(0) ;
               System.out.println("----------------------------------------------") ;
               
               if(type2=='y'){
               totalprice = discount + offer ;
                  System.out.print("Total cash payment : RM" + totalprice) ;
               }
               
               else if(type2 == 'n'){
               totalprice = discount ;
                  System.out.print("Total cash payment : RM" + totalprice) ;
               }
               
               else               
                  System.out.println("Typing Error") ;
            }
            
            else if(type1 == 'i'){
               System.out.print("Please enter the deposit amount : RM");
                  deposit = scan.nextDouble();
               
               System.out.println("----------------------------------------------") ;
               System.out.println("Enter (1) for duration 12 months") ;
               System.out.println("Enter (2) for duration 24 months") ;
               System.out.println("----------------------------------------------") ;
               
               System.out.print("Please enter (1) or (2) : ");
                  duration = scan.nextDouble();
            
               System.out.println("----------------------------------------------") ;
               
            amount = Package - deposit ;
            
            if(duration==1){
               InterestRate = 0.04;
               payment = ((InterestRate *amount) + amount) /12;
                  System.out.printf("The total monthly payment are : RM%.2f", payment);
            }
            
            else if(duration==2){
               InterestRate = 0.05;
               payment = ((InterestRate *amount) + amount) /24;
                  System.out.printf("The total monthly payment are : RM%.2f", payment);
            }
            else
             System.out.println("Typing Error") ;
          }
         
            else
               System.out.println("Typing Error") ;        

   }
}