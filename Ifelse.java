import java.util.Scanner;
   public class Ifelse {
      public static void main(String [] args) {
   
      
   
         int myArray[]={2,2,5,4,8};

               int length=myArray.length;

                      int toFind = 5;
                      boolean found = false;
                  
                      for(int i = 0; i < length; i++) {
                          if(myArray[i]==toFind) {
                              found=true;
                          }
                      }
                  
                      System.out.println(myArray.length);
                      System.out.println(found); 

     
   
   }
}