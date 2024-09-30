import java.util.Scanner;
   public class Assigment3_Q1_OoiYauMing {
      public static void main(String args []) {
         
      Scanner scan = new Scanner(System.in);
      double radius, height, length, width;
      int choice;
      
      System.out.print("\nThis program can calculate the area of a rectangle,\n" + "the area of a circle, or volume of a cylinder.");
      
      do{
      
      System.out.println("\n------------------------------------------------");
      System.out.println("To run the program enter: ");
      System.out.println(" 1: To find the area of a rectangle.");
      System.out.println(" 2: To find the area of a circle.");
      System.out.println(" 3: To find the area of a cylinder.");
      System.out.println("-1: To terminate the program.");
      System.out.println("------------------------------------------------");
      
      System.out.print("Please enter the number: ");
         choice = scan.nextInt();
      
      
       switch (choice){
           
         case 1:
            System.out.print("Enter the length of the rectangle: ");
               length = scan.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
               width = scan.nextDouble();
               
            System.out.println("------------------------------------------------");
            System.out.print("The Area of Rectangle is: " + rectangle(length, width));
               break;
             
         case 2:
            System.out.print("Enter the radius of the circle: ");
               radius = scan.nextDouble();
               
            System.out.println("------------------------------------------------");
            System.out.printf("The Area of Circle is: %.2f", circle(radius));
               break;
                    
        case 3:
            System.out.print("Enter the radius of the base of the cylinder: ");
               radius = scan.nextDouble();
            System.out.print("Enter the height of the cylinder: ");
               height = scan.nextDouble();
               
            System.out.println("------------------------------------------------");
            System.out.printf("The Volume of Cylinder is: %.2f", cylinder(radius, height));
               break;
        
        case -1:
            System.out.println("------------------------------------------------");
            System.out.println("\t\t\tHave a nice day ");
            System.out.println("------------------------------------------------");
               break;
            
         default:
            System.out.print("Invalid choice!");
            }
         } while(choice != -1);   
         
      }
      
      public static double rectangle(double i, double w) {
         return i*w;
      }
      
      public static double circle(double r) {
        final double PI = 3.1419;
         return PI*r*r;
      }
      
      public static double cylinder(double bR, double h) {
       final double PI = 3.1419;
         return (2*PI*bR*h)+(2*PI*bR*bR);
      }

   }