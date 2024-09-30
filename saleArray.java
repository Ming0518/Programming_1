import java.util.Scanner;
public class saleArray{
   public static void main(String[] args){
   
         Scanner scan = new Scanner(System.in) ;
         
      int i;
      int count [] = new int [5];
      char[] alphabet = new char[20];
                       
      for (i = 0; i < alphabet.length; i++){
         System.out.print("Please input a sentence (should be 20 char):");
            alphabet[i] = scan.next().charAt(0);
            
            if(alphabet[i] == 'a'|| alphabet[i] == 'A' )
               count[0]++;
                                  
            else if(alphabet[i] == 'e'|| alphabet[i] == 'E')
               count[1]++;
                        
            else if(alphabet[i] == 'i'|| alphabet[i] == 'I')
               count[2]++;
                        
            else if(alphabet[i] == 'o'|| alphabet[i] == 'O')
               count[3]++;
                        
            else if(alphabet[i] == 'u'|| alphabet[i] == 'U')
               count[4]++; 
          }
         
         System.out.printf("%13s%8s\n","Vowel","Count");
         System.out.printf("%11s%8d\n",'a',count[0]);
         System.out.printf("%11s%8d\n",'e',count[1]);
         System.out.printf("%11s%8d\n",'i',count[2]);
         System.out.printf("%11s%8d\n",'o',count[3]);
         System.out.printf("%11s%8d\n",'u',count[4]);  
               
   }
}          
