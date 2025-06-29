class ReadDigits {

    public static void main(String[] args) {
        int num =123;
        System.out.println(num);

        while(num!=0)
        {
            int rem = num%10;
            System.out.println(rem);
            num= num/10;
        }
    }
    
}
