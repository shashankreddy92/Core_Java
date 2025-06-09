import java.util.Scanner;

public class EqualsTo100 {

    public static void main(String[] args)
    {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter n value:");
    int n = scanner.nextInt();
    if(n==100)
    {
        System.out.println(n+" equals to 100");
    }
    //else if => when we have multiple conditions with their own implementation
    else if(n>100)
    {
        System.out.println(n+" greater than 100");
    }
    else
    {
        System.out.println(n+" lesser than 100");
    }
    
}
}
