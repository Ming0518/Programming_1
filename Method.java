import java.util.Scanner;
   public class Method{
      public static void main(String [] args) {
   
      input();
      }
   
       public static void input(){
         Scanner scan = new Scanner(System.in) ;        
         
         int n,s ;

         System.out.print("Please enter the value n: " );
            n = scan.nextInt();
         
         System.out.print("Please enter the value s: " );
            s = scan.nextInt();
            
         n = Change();
         s = Change();
         System.out.println(n);
          System.out.println(s);
         
    }
    
    public static void Change(){  
      num1= num1 *2;
      
      
     
      }   
   }

