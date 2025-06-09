import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args)
    {
        System.out.print("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
         System.out.println("Multiplication table of " + n);
        for(int i = 1;i<=10;i++)
        {
           
            System.out.println(  n + " x " + i + " = " +(n*i));
        }
    }
    
}
