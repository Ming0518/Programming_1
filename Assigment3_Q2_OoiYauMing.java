import java.util.Scanner;
   public class Assigment3_Q2_OoiYauMing {
      static Scanner scan = new Scanner(System.in) ;
         public static void main(String args []) {   
         
         double rate,time,income,total,realtime;  
         char Choice = ' ';
         
         System.out.println("------------------------------------------");
         System.out.println("\t\tA&N Accounting Firm Assistance");
         
         
         while(Choice != 'N'){
         
         double charge = 0;
         
         System.out.println("------------------------------------------");
         
            rate = HourlyRate() ;
            time = ConsultingTime() ; 
            income = Income() ;
            
            if(income<=25000){
               realtime = time - 30;
                  if(realtime<=30)
                     System.out.println("There are no charges");
                  else
                     charge=0.4;
            }
            
            else{
               realtime = time - 20 ;
                  if(realtime<=20)
                     System.out.println("There are no charges");
                  else
                     charge = 0.7;
            }
            
               total = BillingCharge(realtime,rate,charge) ;
               
               System.out.println("------------------------------------------");
               System.out.printf("The billing amount is RM%.2f\n",total);
               System.out.println("------------------------------------------");
            
            System.out.print("Do you have any tax to process (Y/N)?") ;
                     char choice = scan.next().charAt(0);
                        Choice= Character.toUpperCase(choice);
                        
                        while(Choice != 'Y' && Choice != 'N'){              
                           System.out.print("Please input (Y/N): ");
                              choice = scan.next().charAt(0);
                                 Choice= Character.toUpperCase(choice);}
                                                         
               
            }
            
            System.out.println("------------------------------------------");
            System.out.println("\t\t\tHave a nice day ");
            System.out.println("------------------------------------------");
            
            }
      
      static double HourlyRate(){
         System.out.print("Please enter the hourly rate: ");
            double rate = scan.nextDouble();
            return rate;
         
      }
      
      static double ConsultingTime(){
         double time,hour, minutes;
         
            System.out.print("PLease enter the total \"hours\" of consulting time: ");
               hour = scan.nextDouble();
               
            System.out.print("PLease enter the total \"minutes\" of consulting time: ");
               minutes = scan.nextDouble();
            
            time = (hour*60) + minutes;     
               return time;
          }
      
      static double Income(){
         System.out.print("PLease enter the yearly income: ");
            double income = scan.nextDouble();     
               return income; 
      }
      
      static double BillingCharge(double a, double b, double c){  
         if(c!=0) 
               return (a/60)*b*c; 
         else
               return (a/60)*b;
      }
}