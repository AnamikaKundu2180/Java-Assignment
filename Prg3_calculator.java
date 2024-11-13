/*Build a menu-driven calculator that performs addition, subtraction,
 multiplication, or division based on the user's choice. Use if-else
 statements to determine the operation. 
Keep prompting the user to perform another operation until they choose
 to exit */


import java.util.Scanner;
public class Prg3_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validOperation = true ;

           
        while (validOperation=true) {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = sc.nextInt();

            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();
            double result;
        
            if (choice == 1) {
                result = num1 + num2;
                System.out.println("The result of addition is: " + result);
            } else if (choice == 2) {
                result = num1 - num2;
                System.out.println("The result of subtraction is: " + result);
            } else if (choice == 3) {
                result = num1 * num2;
                System.out.println("The result of multiplication is: " + result);
            } else if (choice == 4) {
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                    System.out.println("The result of division is: " + result);
                }
            } else {
                System.out.println("Invalid choice! Please select a valid operation.");
                validOperation = false;
            }

            if (validOperation) {
                System.out.print("Do you want to perform another operation? (y/n): ");
                char repeat = sc.next().charAt(0);
                if (repeat == 'n' || repeat == 'N') {
                    System.out.println("Exiting the calculator.");
                    break; 
                }
            }
        }

    }
}
