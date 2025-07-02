import java.util.Scanner;

class ArmstrongNumber {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scan.nextInt();
        int temp = num;
        int count = 0 ;

        while(num!=0)
        {
            num = num/10;
            count++;
        }
        int exp = count;
        num = temp;
        int sum =0;

        while(num!=0)
        {
            int base = num % 10;
            int power =1;
            for(int i =1;i<=exp;i++)
            {
                power = power * base;
            }
            sum = sum + power;
            num = num/10;
        }

        if(sum == temp)
        System.out.println(temp+" is a Armstrong Number");
        else
        System.out.println(temp+" is not an Armstrong number");
    }
    
}
