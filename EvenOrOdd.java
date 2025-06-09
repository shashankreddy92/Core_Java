import java.util.Scanner;

public class EvenOrOdd {

    // Method to check even or odd
    public static void evenOrOdd(int number)
    {
        //check whether number is Even
        if(number%2==0)
        {
            System.out.println(number + " is even");
        }
        //else number is Odd
        else{
            System.out.println(number + " is odd");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Enter a number: ");
        int input = scanner.nextInt();

        //call the method
        evenOrOdd(input);

    }
    
}
