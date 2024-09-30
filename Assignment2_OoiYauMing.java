import java.util.Scanner;
   public class Assignment2_OoiYauMing{
      public static void main(String [] args) {
   
         Scanner scan = new Scanner(System.in) ;
            
            char choice,Choice;
            int employee=1;
            double work,pay,regular=0,overtime=0,gross=0,total=0;
            double[] rate = {3.50, 4.00, 4.50, 4.75, 5.00, 5.25, 5.50, 5.75, 6.00};
               
               
               System.out.println("\t\tWeekly Payroll for A&N 24-hour Mini-Mart") ;
               
               do{
                  boolean a=false;
                     System.out.println("---------------------------------------------------") ; 
                     
                     System.out.print("Please Enter Hours Work for employee " + employee + ": ") ;
                        work = scan.nextDouble();     
                        
                        System.out.print("\nEnter pay rate: ") ;
                           pay = scan.nextDouble();                  
                    
                     do{
                     
                        for(int c=0; c<rate.length; c++) {
                           if (pay==rate[c])     
                              a = true;}
                     
                     if(a==false){
                       System.out.println("\nInvalid Pay Rate!") ;
                        System.out.println("The Valid Pay Rates are:") ;
                        System.out.println("---------------------------------------------------") ;
                        
                           for (int i = 0; i < rate.length; i++)
                              System.out.print(rate[i] + "\t"); 
                              System.out.println("\n---------------------------------------------------") ;
                              System.out.print("Plese enter the correct pay rate: ") ;
                                 pay = scan.nextDouble();
                                 }
                                 
                  }while(a==false);
                  
                  System.out.println("---------------------------------------------------") ;
                  
                  if(work>40){
                     regular = 40 * pay ; 
                     overtime = (work-40)*(pay*1.5) ;
                     gross = regular + overtime ;
                        System.out.println("Regular: " + regular) ;
                        System.out.println("Overtime: " + overtime) ;
                              }
                  
                  else if(work<=40){
                     regular = work * pay ;
                     gross = regular ;
                        System.out.println("Regular: " + regular) ;
                        System.out.println("No overtime pay") ;
                                    }
                  
                  
                  System.out.println("Gross: " + gross) ;
                  
                  System.out.println("---------------------------------------------------") ;
                  System.out.print("Do you have any employee to process (Y/N)?") ;
                     choice = scan.next().charAt(0);
                        Choice= Character.toUpperCase(choice);
                           employee++ ;
                              total = total + gross ;
                  }while(Choice=='Y');
                  
                  employee--;
                  
                  System.out.println("---------------------------------------------------") ;
                  System.out.println("\nTotal Payroll (Sum): " + total);
                  System.out.println("Total Employee : " + employee);    
                  System.out.println("---------------------------------------------------") ; 
                  System.out.printf("%30s\n","Have a nice day") ;           
                  System.out.println("---------------------------------------------------") ;
      }
   }