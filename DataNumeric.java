public class DataNumeric {
   public static void main(String [] args) {
    
      //variable decleration
      double score = 80;
      int score1 = 50;
      float score2 = 60;
      boolean status = false ;
      char grade = 'B' ;
      String name = "Ooi Yau Ming" + "\r\'Room\': \\2014" ; 
      
      //constant declaration & initialization
      final double MAX_HEIGHT = 3.5;
      
      //print Vs println
      /*System.out.println("Score = " + score);
      System.out.println("Score1 = " + score1);
      System.out.println("Score2 = " + score2);
      System.out.println("My name is " + name);*/
      
      //printf
      System.out.printf("%s%10.2f%n","Score = ", score);
      System.out.printf("%s%6d\n","Score1 = ",score1);
      System.out.println(grade);

      
      
   }
}