import java.util.Scanner;

class Cricket
{
	public static void main(String[] args) 
	{
		System.out.println("Enter jersey number:"); 
		Scanner sc = new Scanner(System.in);
		int jerseyNumber = sc.nextInt();
		
		switch(jerseyNumber)
		{
			case 18:{
				System.out.println("KING");
			}break;
			
			case 45:{
				System.out.println("HITMAN");
			}break;
			
			case 10:
			{
				System.out.println("GOD");
			}break;
			
			case 7:
			{
				System.out.println("Thala");
			}break;
			
			case 17:
			{
				System.out.println("Mr.360");
			}break;
			
			default:{
				System.out.println("Enter valid jersey number");
			}
			
		}
		
		
		
	}
}
