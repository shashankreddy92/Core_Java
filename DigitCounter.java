public class DigitCounter {

    // Parameterized method to count digits
    public static int countDigits(int number) {
        int count = 0;

         // Handling negative numbers manually
        if (number < 0) {
            number = -number;
        }

        // Special case for 0
        if (number == 0) {
            return 1;
        }

        while (number > 0) {
            count++;
            number = number/10;
        }

        return count;
    }

    public static void main(String[] args) {
        int value = -456;  // You can change this value to test with other numbers
        int result = countDigits(value);
        System.out.println("Number of digits in " + value + " is: " + result);
    }
}
