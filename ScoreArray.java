import java.util.Scanner;
   public class ScoreArray{
      public static void main(String[] args){
   
         Scanner scan = new Scanner(System.in) ;
         
            int row, col,team=1,player=1 ;
            double[][] score = new double [5][4];
            
            for(row = 0; row < score.length; row++) {
               player=1;              
                  for(col = 0; col < score[row].length; col++) {
                     System.out.print("Please enter the score of team " + team + " and player " + player + ": ");
                        score[row][col]=scan.nextInt();
                           player++ ;}
                           team++ ;}
                           
            for(row = 0; row < score.length; row++) {
               player=1;
               team=1;              
                  for(col = 0; col < score[row].length; col++) {
                     System.out.println("The score of team " + team + " and player " + player + " is " + score[row][col]);
                     player++ ;}
                       team++ ;}
   }
}