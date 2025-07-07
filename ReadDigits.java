class ReadDigits {

    public static void main(String[] args) {
        int num =123;
        System.out.println(num);

        while(num!=0)
        {
            int rem = num%10;//to get last number
            System.out.println(rem);
            num= num/10;//to remove last number
        }
    }
    
}
