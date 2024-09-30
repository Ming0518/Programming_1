import java.util.Scanner;
public class Test1Scanner{
   public static void main(String [] args) {
   

   Scanner scan = new Scanner(System.in) ;
 
      char a = mystery("abc", 2, 0);
         System.out.print(a);

          
   
   }
   public static char mystery(String s, int n, int m)
      {
          if (n == 1) 
            return s.charAt(m);
            
          char first  = mystery(s, n / 2, m * 2);
          char second = mystery(s, n / 2, m * 2 + 1);
          
          System.out.print(first + " " + second + " ");
              
          return first;
       }

}