
import java.util.Scanner;
public class PayrollDemo {
    public static void main(String[] args) {
        
        double ID_number, gross_pay, state_tax, federal_tax, Net_pay;
        Employee first = new Employee();
        first.input();
       
       Payroll second = new Payroll();
       second.calculateNetPay(gross_pay, state_tax, federal_tax);
       second.printOutput();
    }
}

class Employee{
    Scanner scan = new Scanner(System.in);

    double ID_number, gross_pay, state_tax, federal_tax ;
        
    public void Employee(double id,double gross, double state, double federal){
        ID_number = id ;
        gross_pay = gross;
        state_tax = state; 
        federal_tax = federal;
}
    
    void input(){
    System.out.print("Enter your employee ID number: ");
        ID_number = scan.nextDouble();
    System.out.print("Enter your Gross Pay         : RM ");
        gross_pay = scan.nextDouble();
    System.out.print("Enter your State Tax         : RM ");
        state_tax = scan.nextDouble();
    System.out.print("Enter your Federal Tax       : RM ");
        federal_tax = scan.nextDouble();
}
}

class Payroll{
    
    double calculateNetPay(double gross, double state, double federal){
        double net = gross - state - federal;
        return net;
    }
            
    void printOutput(){
        System.out.println("Net pay is : RM " + net);
    }
    
}