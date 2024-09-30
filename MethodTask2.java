import java.util.Scanner;
public class MethodTask2{
   public static void main(String[] args){
      
      Scanner scan = new Scanner(System.in) ;
       char symbol=' ';
       double result = 0;
       
         do{
         menu(); 
            
            System.out.print("Please input your operation:");       
            symbol = scan.next().charAt(0); 
            
            boolean choice = false;
            
            if(symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/' || symbol == '^'|| symbol == 'q')
                  choice=true;
            
            
               while(choice==false){
               
                     System.out.print("Please input valid operation symbol:");   
                        symbol = scan.next().charAt(0); 
                           if(symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/' || symbol == '^'|| symbol == 'q')
                              choice=true;
               }
     
         if(symbol=='q')
            quit();
            
         else{
        
         System.out.print("Please input a number:");
         double num = scan.nextInt();
            
         if(symbol == '+')
         result = add(result,num);
         
         else if(symbol == '-')
         result = subtract(result,num);
         
         else if(symbol == '*')
         result = multiply(result,num);
         
         else if(symbol == '/')
         result = divide(result,num);
         
         else if(symbol == '^')
         result = power(result,num);   
         
         
         System.out.println("Result so far : " + result);  
         }
         }while(symbol != 'q');
         
         
         
         }
         
   public static void menu(){
      System.out.println("Operation Menu:");
      System.out.println("+  add");
      System.out.println("-  subtract");
      System.out.println("*  multiply");
      System.out.println("/  divide");
      System.out.println("^  power");
      System.out.println("q  quit");   
      }
      
      public static double add(double result, double num){
      result = result + num;
      return result;
      }
      
      public static double subtract(double result, double num){
      result = result - num;
      return result;
      }
      
      public static double multiply(double result, double num){
      result = result * num;
      return result;
      }
      
      public static double divide(double result, double num){
      result = result / num;
      return result;
      }
      
      public static double power(double result, double num){
      result = (Math.pow(result, num));
      return result;
      }
      
      public static void quit(){
         System.out.print("Good Bye");
      }
      
}