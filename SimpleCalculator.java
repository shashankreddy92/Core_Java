import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = 0, num2 = 0;
        boolean validInput = false;

        // Get first number with validation
        while (!validInput) {
            System.out.print("Enter first number: ");
            if (scanner.hasNextDouble()) {
                num1 = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // clear the invalid input
            }
        }

        validInput = false;

        // Get second number with validation
        while (!validInput) {
            System.out.print("Enter second number: ");
            if (scanner.hasNextDouble()) {
                num2 = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // clear the invalid input
            }
        }

        // Get operator with validation
        char operator = ' ';
        validInput = false;

        while (!validInput) {
            System.out.print("Enter an operator (+, -, *, /): ");
            String input = scanner.next();

            if (input.length() == 1) {
                operator = input.charAt(0);
                if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                    validInput = true;
                } else {
                    System.out.println("Invalid operator. Please use only +, -, *, or /.");
                }
            } else {
                System.out.println("Invalid input. Please enter a single character operator.");
            }
        }

        double result;

        // Perform calculation
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
        }

        scanner.close();
    }
}
