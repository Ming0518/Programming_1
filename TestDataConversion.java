public class TestDataConversion {
   public static void main(String [] args) {
   
      //assingnment conversion
      
      int dollars = 20 ;
      double money = (double)dollars ; 
   
      System.out.println(dollars/20) ;
      System.out.println(money/20) ;
   
      //promotion
      int count = 12 ;
      double sum = 490.27 ;
      double result = sum / count ; //count will be promoted to double then divison will be executed (12.0)
      
      System.out.println(result) ; 
      
      //casting
      int total = 50 ;
      double result = (double)total/6;
      
      System.out.print(result) ;
      
      //math class
      
      int x = 10 ;
      int n = 5 ;
      System.out.println(n + " to the power of " + x + " is " + Math.pow(x, n)) ;
      
      System.out.print(" Square root of " + x + " is " + Math.sqrt(x)) ;
      
      
   
   
      }
}
   