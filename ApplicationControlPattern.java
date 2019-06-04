package applicationcontrolpattern;
import java.util.Scanner;
/**
 *
 * 
 */
public class Applicationcontrolpattern {
    
    public static void main(String[] args) {    
    
        try {
    
                Scanner input = new Scanner(System.in);
                Controller calculate = new Controller();
                Integer first;
                Integer second;
                String operand;
            
                System.out.println("Enter number of passengers ");
                first = Integer.parseInt(input.nextLine());
                
                System.out.println("Enter the day you wish to travel (Thursday, Friday, Saturday, Sunday) ");
                operand = input.nextLine();
                
                System.out.println("Enter a number ");
                second = Integer.parseInt(input.nextLine());
                
                System.out.println("The answer is: ");
                
                calculate.handleOperator(operand,first,second);
                
                
        }
        
        catch (NumberFormatException ex) {
                
                System.out.println(" ");
                System.out.println("Please, Enter Numbers only");
                System.out.println(" ");
                Scanner input = new Scanner(System.in);
                Controller calculate = new Controller();
                Integer first;
                Integer second;
                String operand;
                
                System.out.println("Enter number of passengers ");
                first = Integer.parseInt(input.nextLine());
                
                System.out.println("Enter the day you wish to travel (Thursday(T), Friday(F), Saturday(ST), Sunday(SY) /) ");
                operand = input.nextLine();
                
                System.out.println("Enter a number ");
                second = Integer.parseInt(input.nextLine());
                
                System.out.println("Your subtotal is: ");
                
                calculate.handleOperator(operand,first,second);
                
        }
    
    }


}