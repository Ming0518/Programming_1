import java.util.Scanner;
   public class Assignment22{
      public static void main(String [] args) {
      
      Scanner scan = new Scanner(System.in) ;
      
      char choice = 0;
      boolean a=false;
         double work,pay,regular=0,overtime=0,gross = 0,total=0;
         int employee=0;
         double[] rate = {3.50, 4.00, 4.50, 4.75, 5.00, 5.25, 5.50, 5.75, 6.00};
            
            do{
            System.out.println("Caculate Weekly Payroll for A&N 24-hour Mini-Mart") ;
            System.out.println("----------------------------------------------") ; 
               
            System.out.print("Enter hours work: ") ;
               work = scan.nextDouble();
               
               System.out.print("\nEnter pay rate: ") ;
               pay = scan.nextDouble();  
                            
                            
          for(int c=0; c<rate.length; c++) { 
            if (pay==rate[c])  
            a = true;} 
                             
            if(a==true) {                                                                          
               System.out.println("\n----------------------------------------------") ;
               
               if(work>40){
               regular = 40 * pay ; 
               overtime = (work-40)*(pay*1.5) ;
               System.out.println("Regular: " + regular) ;
               System.out.println("Overtime: " + overtime) ;}
               
               else if(work<=40){
               regular = work * pay ;
               System.out.println("Regular: " + regular) ;
               System.out.println("No overtime pay") ;
               }
               
               gross = regular + overtime ;
               System.out.println("Gross: " + gross) ;    
               System.out.println("Do you have any employee to process (Y/N)?") ;
               choice = scan.next().charAt(0);
               employee++ ;
               total = total + gross ;  }                  
           
            else if(a==false) {
            	 System.out.println("Invalid Pay Rate!") ;
                 System.out.println("Valid Pay Rates are:") ;
                    for (int i = 0; i < rate.length; i++)
                       System.out.print(rate[i] + "\t"); 
         System.out.println("\n----------------------------------------------") ;
         System.out.println("Do you want to try again? (Y/N)?") ;
         choice = scan.next().charAt(0);
            }   
           
            }while(choice=='Y');
            
            
            System.out.println("Total Payroll (Sum): " + total);
            
            System.out.println("Total Employee : " + employee);
      
      
      }
     }