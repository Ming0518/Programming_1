import java.util.Scanner;
   public class LabTest1_Q2_OoiYauMing{
      public static void main(String [] args) {
   
       Scanner scan = new Scanner(System.in) ;
      
         System.out.print("Please enter the access code: ");
            int code = scan.nextInt() ;
         
         if (code==1645){
            System.out.print("Access Granted\nWelcome PhD student");
         }
         
         else if(code==8345){
            System.out.print("Access Granted\nWelcome Master student");
         }
         
         else if(code==9998){
            System.out.print("Access Granted\nWelcome Visitor");
         }
         
         else if(code==789){
            System.out.print("Restricted Access");
         }
         
         else{
            System.out.print("Access Denied");
         }
   }
}