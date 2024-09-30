public class TestError {
   public static void main(String [] args) {
      
        binaryEquivalent(5);
   }
   public static String binaryEquivalent(int n){
   if(n==0)
      return 0;
   
   else if(n%2 == 0)
      return n = 0 + binaryEquivalent(n) ; 
  
   else if(n%2 != 0)
       return n = n + 0 + binaryEquivalent(n) ; 
        


   }

}