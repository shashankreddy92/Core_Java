import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number;

        int sum = 0;
        int product = 1;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            product = product * digit;
            number = number/10;
        }

        if (sum == product) {
            System.out.println(original + " is a Spy Number.");
        } else {
            System.out.println(original + " is NOT a Spy Number.");
        }

        scanner.close();
    }
}
