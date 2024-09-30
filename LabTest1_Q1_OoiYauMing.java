import java.util.Scanner;
   public class LabTest1_Q1_OoiYauMing{
     public static void main(String [] args) {
   
      Scanner scan = new Scanner(System.in) ;
      
      int number, capacity,enrollment,emptyseats;
      String word = "" ;
      
      System.out.print("Please input room number: ");
         number = scan.nextInt() ;
      
      System.out.print("Please input room capacity: ");
         capacity = scan.nextInt() ;
      
      System.out.print("Please input enrollment: ");
         enrollment = scan.nextInt() ;
      
      
      if(enrollment>capacity){
         System.out.print("Input error!!");}
      
      else{
      
         System.out.printf("\n%-6s%-10s%-12s%-12s%-17s\n","Room", "Capacity", "Enrollment", "Empty Seats", "Filled/Not Filled");
         System.out.printf("%-6s%-10s%-12s%-12s%-17s\n","****", "********", "**********", "***********", "*****************");
         
         emptyseats = capacity - enrollment ;
      
      if(emptyseats != 0){
         word = "Not Filled" ;}
         
      else{
         word = "Filled" ;}
         
         System.out.printf("%-6d%-10d%-12d%-12d%-17s",number,capacity,enrollment,emptyseats,word);
      }
   
   }
}