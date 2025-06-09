import java.util.Scanner;

class Result 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks:");
		int marks = sc.nextInt();
		
		if(marks>=90 && marks<=100)
		{
			System.out.println("Excellent.");
		}
		else if(marks>=60 && marks<=89)
		{
			System.out.println("Good");
		}
		else if(marks>=35 && marks<=59)
		{
			System.out.println("Avg");
		}
		else if(marks>=0 && marks<=34)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invaild marks entered");
		}
		
		
		
		
		
		
		
	}
}
