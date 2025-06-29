class Demo1 {

    static int a;
    static double b = 2.5;

    public static void view()
    {
        System.out.println("Static method");
    }

    static
    {
        System.out.println("Multi line static initializer");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        System.out.println(a);//0
        System.out.println(b);//2.5
        view();
        System.out.println("Main ended");
    }
    
}
