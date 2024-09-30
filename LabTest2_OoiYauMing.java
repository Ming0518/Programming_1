import java.util.Scanner;
   public class LabTest2_OoiYauMing{
     public static void main(String [] args) {
     
      Scanner scan = new Scanner(System.in);
     
      char i,I;
      int num1;
      int toppings [] = new int[5];
                       
         System.out.println("---------------------------------------------------------------------------");
         System.out.println("              CACULATE TOTAL TOPPING OF CHOCO JAR SOLD                     ");
                       
      do{
         System.out.println("---------------------------------------------------------------------------");
            System.out.print("Please input number of Marshmallow choco jar sold          : ");
              num1 = scan.nextInt();
               toppings[0] = toppings[0]+num1;
               
            System.out.print("Please input number of White Chocolates choco jar sold     : ");
               num1 = scan.nextInt();
                  toppings[1] = toppings[1]+num1;
            
            System.out.print("Please input number of Chewy Chocolates choco jar sold     : ");
               num1 = scan.nextInt();
                  toppings[2] = toppings[2]+num1;
               
            System.out.print("Please input number of Dark Chocolate Creams choco jar sold: ");
               num1 = scan.nextInt();
                  toppings[3] = toppings[3]+num1;
               
            System.out.print("Please input number of Milo Nougat choco jar sold          : ");
               num1 = scan.nextInt();
                  toppings[4] = toppings[4]+num1;           
               
               System.out.print("Do you have more order to process (Y/N)?:") ;
                  I = scan.next().charAt(0);
                     i= Character.toUpperCase(I);
                            
                        while(i != 'Y' && i!= 'N'){              
                           System.out.print("Please input only (Y/N/y/n): ");
                              I = scan.next().charAt(0);
                                 i= Character.toUpperCase(I);}
                                                         
               }while(i=='Y');
               
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("The total number of Marshmallow choco jar sold are          : " + toppings[0]);
            System.out.println("The total number of White Chocolates choco jar sold are     : " + toppings[1]);
            System.out.println("The total number of Chewy Chocolates choco jar sold are     : " + toppings[2]);
            System.out.println("The total number of Dark Chocolate Creams choco jar sold are: " + toppings[3]);
            System.out.println("The total number of Milo Nougat choco jar sold are          : " + toppings[4]);
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("                           HAVE A NICE DAY                                 ");
            System.out.println("---------------------------------------------------------------------------");
      
   }
}          