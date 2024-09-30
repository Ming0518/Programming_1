import java.util.*;
public class Test {    
   public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    
     System.out.println(1/2);

        System.out.print(mystery(2,10));


}
public static int mystery(int a, int b){
      if(b==0)
         return 0;
     if(b%2==0)
         return mystery(a+a, b/2);
         
         return mystery(a+a, b/2)+a;
}

}