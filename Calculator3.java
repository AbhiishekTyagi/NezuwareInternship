// Task 2: Create the Console  Calculator

import java.util.*;

class Calculator3{
    static public  void main(String...args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.println("Enter first number please:");
                double num1 = sc.nextDouble();

                System.out.println("Enter second number please:");
                double num2 = sc.nextDouble();

                System.out.println("Choose an operation (+, -, *, /):");
                char operation = sc.next().charAt(0); //To pick one Character 

                double res = 0;

                switch (operation) {
                    case '+':
                        res = num1 + num2;
                        break;
                    case '-':
                        res = num1 - num2;
                        break;
                    case '*':
                        res = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is Infinity");
                            continue;
                        }
                        res = num1 / num2;
                        break;
                    default:
                        System.out.println("Invalid operation. Please select +, -, *, or /.");
                        continue;
                }

                System.out.println("Result is: " +res);

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numeric values.");
                sc.next();  // Clear the invalid input
            }

            System.out.println("Do you want to perform another calculation? (yes/no)");
            String continueCal = sc.next();
            if (!continueCal.equalsIgnoreCase("yes")) {
                break;
            }
        }

        sc.close();
        System.out.println("Calculator has exited.");
    }
}
