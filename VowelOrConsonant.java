import java.util.Scanner;

class VowelOrConsonant 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a character:");
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		switch(ch)
		{
			case 'A','E','I','O','U','a','e','i','o','u':
			{
				System.out.println("Vowel");
			}break;
			
			default:
			{
				System.out.println("Consonant");
			}
			
		}
		
	}
}
