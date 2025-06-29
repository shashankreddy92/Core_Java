class DecimalToBinary {
    public static void main(String[] args) {
    int dec = 9;
    int bin = 0;
    int i = 1;

    while(dec!=0)
    {
        int rem = dec % 2;
        bin = bin + rem*i;
        dec = dec/2;
        i = i*10;
    }
    System.out.println("Binary:"+bin);
    }
    
    
    
}
