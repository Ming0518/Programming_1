import java.util.Scanner;
public class labwhileloop {
   public static void main(String [] args) {   

      Scanner scan = new Scanner(System.in) ;
        
        
        int num1 = 0 ;
        int num2 = 0 ;
        int num3 = 0 ;
        
        
        System.out.print("Please enter first number : ");
        num1 = scan.nextInt() ;
        
        System.out.print("Please enter second number : ");
        num2 = scan.nextInt() ;
        
        System.out.print("Please enter third number : ");
        num3 = scan.nextInt() ;
        
        
         while (num3>1){
             System.out.println(num2 + " X " + num1 + " = " + num1 * num2);
                  num2++; 
                  num3--;}

             
                
  
  }
} 