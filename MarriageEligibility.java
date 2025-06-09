import java.util.Scanner;

class MarriageEligibility 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gender");
		char gender = sc.next().charAt(0);
		System.out.println("Enter age:");
		int age = sc.nextInt();
		if(gender=='m'|| gender=='M')
		{
			if(age>=21)
			{
				System.out.println("Eligible");
				System.out.println("Going to Hell");
			}
			else
			{
				System.out.println("Not Eligible");
				System.out.println("Going to Goa");
			}
		}
		else if(gender == 'f' || gender == 'F')
		{
			if(age>=18)
			{
				System.out.println("Eligible");
			}
			else
			{
				System.out.println("Not Eligible");
			}
		}
		else
		{
			System.out.println("Invalid input");
		}
		
		
	}
}
