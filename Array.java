import java.util.Scanner;
   public class Array{
      public static void main(String [] args) {
   
         Scanner scan = new Scanner(System.in) ;
         
         int[] score = new int[5];
         
         //declare
         for(int i=0; i<5; i++){
         System.out.print("Please input students score: ");
         score[i] = scan.nextInt();
         }
         /*
         //display
         for(int i=0; i<5; i++){
         System.out.println("Score " + (i+1) + " = " + score[i]);
         }
         
         //sum
         int sum=0;
         for(int i=0; i<5; i++){
            sum+=score[i];
         }
         
         System.out.println("Sum of score = " + sum);
         System.out.println("The average of score = " + (sum/score.length));
      
         //largest
         int max = 0;
         for(int i=0; i<5; i++){
            if(score[max]<score[i])
               max=i;
         }
         System.out.println("The largest score is: " + score[max]);
         
         //array out of bounds, run time error
         for(int i=0; i<5; i++){
         System.out.println("Score " + (i+1) + " = " + score[i]);
         }
         
        //array of string 
        String[] name = new String[3] ;
        for(int i=0; i<3; i++){
        System.out.print("Please input name: ");
        name[i]= scan.nextLine();
        }
        System.out.println(name[0]+name[1]+name[2]);*/
        
        int max = 0;
         for(int i=0; i<5; i++){
            if(score[max]<score[i])
               max=i;
         }
         System.out.println("The largest score is: " + score[max]);
      }        
}