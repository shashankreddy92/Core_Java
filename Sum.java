import java.util.Scanner;

public class Sum {

    public static void sum(int a, int b)
    {
      int result = a + b;
      System.out.println("Result:"+ result);

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int x = scanner.nextInt();
        System.out.println("Enter second number:");
        int y = scanner.nextInt();
        sum(x,y);
        
    }
    
}
