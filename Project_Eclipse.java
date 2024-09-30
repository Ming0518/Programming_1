import java.util.Scanner;
   public class Project_Eclipse {
      static Scanner scan = new Scanner(System.in) ;
         public static void main(String args []) {
         
         String [] menu = new String [100];
            String [] feedback = new String [100];
               double [] price = new double [100];
                  int choice, choice1, count=0, count1=0;
            
            
            System.out.println("--------------------------------------------");
            System.out.println("\t\t\tWELCOME TO THE RESTAURANT");
            System.out.println("--------------------------------------------\n");
            
            do{
            
            FunctionMenu();
               System.out.print("Please Enter Your choice:");
                  choice=scan.nextInt();
            
            if (choice==0){
            System.out.println("--------------------------------------------");
               System.out.println("\t\tTHANKS YOU AND HAVE A NICE DAY "); 
                  System.out.println("--------------------------------------------");
                  break;
             }   
            
            else if(choice==1) {
               Menu();
            
            System.out.print("Please Enter Your choice:"); 
               choice1=scan.nextInt();
               
            count = MenuChoice(menu,choice1,count,price); 
            } 
            
            else if(choice==2){
            
            }
            
            else if(choice==3){
               FeedbackMenu();
            
            System.out.print("Please Enter Your choice:"); 
               choice1=scan.nextInt();
               
            count1 = FeedBackChoice(feedback,choice1,count1);
            }
            
            else{
            System.out.println("--------------------------------------------");
            System.out.println("Invalid Choice!!");
            System.out.println("Please enter number 0 to 3");
            }
            
           }while (choice !=0);
         }//End for the main
         
         //Display the function menu to users
         static void FunctionMenu()
         {
          System.out.println("----------------- FUNCTION -----------------\n" +"1. Menu\n" +"2. Order\n" +"3. Feedback\n" + "0. EXIT");
          System.out.println("--------------------------------------------");
         }
         
         //Display the menu to users
          static void Menu()
         {
          System.out.println("-------------------- MENU --------------------\n" +"1. Add Menu\n" +"2. Edit Menu\n" +"3. Delete Menu\n"+"4. Display Menu\n"+"0. Exit");
          System.out.println("--------------------------------------------");
         }
         
         //Display the feedback menu to users
         static void FeedbackMenu(){
         System.out.println("-------------------- MENU --------------------\n" +"1. Add Feedback\n" + "2. Display Menu\n" + "0. EXIT");
          System.out.println("--------------------------------------------");
         }
         
         
         //Go to the function that users input in menu
         static int MenuChoice(String [] menu,int choice1,int count,double [] price){
            switch(choice1){
               case 0:
               break; 
               
               case 1: count = AddMenu(menu, count,price); 
                  break;
           
               case 2: EditMenu(menu,count,price); 
                  break;
           
               case 3: count = DeleteMenu(menu,count,price); 
                  break;
           
               case 4: DisplayMenu(menu,count,price); 
                  break;
                  
           
               default: System.out.println("Sorry your choice is not in the list. Please choose again.");
           }//switch
           return count;
           }
         
         ////Go to the function that users input in Feedback
         static int FeedBackChoice(String [] feedback,int choice,int count1){
            switch(choice){
               case 0:
               break; 
               
               case 1: count1 = AddFeedBack(feedback, count1); 
                  break;
           
               case 2: DisplayFeedBack(feedback,count1); 
                  break;
           
               default: System.out.println("Invalid Choice. Please choose again.");
           
           }//switch
           return count1;
         }//End Choice
         
         //Add the menu and price
         static int AddMenu(String[] menu, int count,double[] price){
            if (count < menu.length){
               System.out.print("Please enter the menu name : ");
                  
                     menu[count]= scan.nextLine();
                  
                  System.out.print("Please Enter the price for this item: ");
                     price[count++]=scan.nextDouble();
         }     
               return count;
       }
         
         
         //Edit Menu and price
         static void EditMenu(String [] menu,int count,double[] price){
           String name;
           double value;
           boolean find=false;
           
            if (count==0)
                  System.out.println("Sorry list is empty.");
                  
              else {
               System.out.print("Menu Name?:");
                  scan.nextLine();
                     name=scan.nextLine();
                     
             for (int i=0; i<count;i++){
               if (menu[i].equals(name)){
                   System.out.print("New Menu Name?:");
                        name=scan.nextLine();
                        
                        System.out.print("New Price?:");
                           value=scan.nextDouble();  
                     
                   menu[i]=name;
                   price[i]=value;
                   find=true;
                   break;
                   }
                 }
                 if (find==false)
                  System.out.println("Sorry menu you want to delete is not in the list.");
            }   
       }
         
         //Delete Menu and price
         static int DeleteMenu(String [] menu,int count,double []price){
            int i,j;
            String nom;
                  int bil=count;
                  boolean delete=false;
                  
                  if (bil==0)
                    System.out.println("Sorry menu are empty.");
                    
                 else {
                 System.out.print("Menu to be deleted?:");
                  scan.nextLine();
                     nom=scan.nextLine();
                 for ( i=0; i<bil;i++)
                    if (menu[i].equals(nom)){
                       for(j=i;j<count-1;j++){
                          menu[j]=menu[j+1];
                          price[j]=price[j+1];}
                        --bil;
                        delete=true;
                     break;
                     }
                   }
                  if (delete==false)
                  System.out.println("Sorry the menu is not in the list.");
                  return bil;
           }//end delete
                  
         //Display the menu and price
         static void DisplayMenu(String [] menu,int count,double [] price){
              if (count==0)
                   System.out.println("Sorry the menu is empty.");
              else{
               System.out.println("**************************************");
                  for (int i=0; i<count;i++){
                    System.out.printf("Item " + (i+1) + " : %-10s",menu[i]) ;
                        System.out.println("\tRM"+price[i]);    
                     }
                     System.out.println("**************************************");
                }
         }//end display
         
         //Add the feedback
         static int AddFeedBack(String [] feedback, int count1){         
           if (count1 < feedback.length){
              System.out.print("Please Enter feedback: ");
               scan.nextLine();
                  feedback[count1++]=scan.nextLine();
           }
           else
             System.out.println("FeedBack Menu is FULL.");
           sefsdf
           return count1;      
         }//end added
         
         //Display Feedback
         static void DisplayFeedBack(String [] feedback,int count1){
            
              if (count1==0)
                   System.out.println("Sorry the feedback is empty.");
              else
               for (int i=0; i<count1;i++){
                 System.out.println("FeedBack "+(i+1)+":"+feedback[i]);        
            }
         }//end display
      }//end class