class BinaryToDecimal {

    public static void main(String[] args) {
        
        int bin = 1001;
        int dec = 0;
        int i =1;

        while(bin!=0)
        {
            int rem = bin %10;
            dec = dec +rem*i;
            bin = bin/10;
            i=i*2;
        }
        System.out.println("Decimal : "+dec);
    }
    
}
