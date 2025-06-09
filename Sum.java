import java.util.Scanner;

public class Sum {

    // Method to add two numbers
    public static int add(int a, int b) {
        int result = a + b; ;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:"); 
        int num2 = scanner.nextInt();

        // Call the add method and store the result
        int sum = add(num1, num2);

        // Display the result
        System.out.println("The sum is: " + sum);
    }
}

    



