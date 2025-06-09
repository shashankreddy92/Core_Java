import java.util.Scanner;

class PrintNames
{
    public static void printNames()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String str = sc.next();
        for(int i =1;i<=5;i++)
        {
            System.out.println("Name:"+str);
        }
    }

    public static void main(String[]args)
    {
        System.out.println("Main method");
        printNames();
        System.out.println("Main ended");
    }
}