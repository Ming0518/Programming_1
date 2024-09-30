import java.util.Scanner;
   public class Prjoject_Eclipse_Tese {
      static Scanner scan = new Scanner(System.in) ;
         public static void main(String args []) {
         
         
         int [] price = new int [15];
         price[0] = 1;
         price[1] =10;
         price[2] =20;
         price[3] =30;
         price[4] =40;
         price[5] =50;
         price[6] =60;
         price[7] =70;
         price[8] =80;
         price[9] =90;
         price[10] =100;
         
            int num=5;
            int count=10000, jake=0;
            
            

            DeletePrice(price,count,num);
            

                     for (int i=0; i<price.length;i++){
                     System.out.println( "item" + i + " \tRM"+ price[i]);
                     
                     
                     }
         }//end display
            
                        
            //Delete Price
         public static int DeletePrice(int [] price,int count,int nom){
            int bil=count;
            boolean delete=false;
         
            if (bil==0)
               System.out.print("");
           else {
                 for(int j = nom ;j<bil;j++){
                 System.out.println(j);
                    price[j]=price[j+1];
                  bil--;
                  delete=true;
                  break;
               }
               
             }
            if (delete==false)
            System.out.println("");
               return bil;
           }//end removeItem            
          }//end class