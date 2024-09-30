import java.util.Scanner;
public class MethodTask1{
   public static void main(String[] args){
   
         Scanner scan = new Scanner(System.in) ;
         System.out.print("Please enter first number: ");
            int num = scan.nextInt();
   
          System.out.print("Please enter second number: ");
            int num2 = scan.nextInt();
            
            oddEven(num);
            oddEven(num2);
            
            System.out.print("Please enter length of rectangle: ");
               int length= scan.nextInt();
            
            System.out.print("Please enter width of rectangle: ");
               int width= scan.nextInt();
               
               drawRectangle(length,width);
            
             }
    
    public static int oddEven(int num) {
      if(num%2 == 0){
      System.out.println(num + " is a even number");
      }
      else{
      System.out.println(num + " is a odd number");
      }
      return num;
}

   public static void drawRectangle(int length, int width){
   
   for(int i=0; i<width ; i++){
      for(int C=1; C<length ; C++){
         System.out.print("*");}
         System.out.println("*");
   }
  
}
}
