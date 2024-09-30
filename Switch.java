import java.util.Scanner;
public class Switch {
   public static void main(String [] args) {
   
   Scanner scan = new Scanner(System.in) ;

   char status ;
   String myStatus ;
   System.out.print("Please enter your status (M = Married and S = Single) : ") ;
   status = scan.next().charAt(0) ;
      
   switch (status)  {
      case 'M' :
         myStatus = "Married" ;
         break ;
         
      case 'S' :
         myStatus = "Single" ;
         break ;
         
      default :
         myStatus = "Error" ;
         break ;

      }
       System.out.println(myStatus) ;
       
   }
   
   
}