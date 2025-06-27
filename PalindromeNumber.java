 class PalindromeNumber {

    public static void isPalindromeNumber(int num)
    {
        int rem = 0 ;
        int sum = 0 ;
        int temp ;

        temp = num ;

        while(num>0)
        {
            rem = num % 10;
            sum = (sum * 10) + rem ; 
            num = num / 10;
        }

        if(temp == sum)
        {
            System.out.println("Is a Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }

    public static void main(String[] args)
    {
        isPalindromeNumber(265);
    }

    
}
