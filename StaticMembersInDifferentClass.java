class StaticMembersInDifferentClass {
    //static members can be accesses in 2 ways when present in different class 
    //and they will will be initilized with default values based on data type.
    public static void main(String[] args) {

        //1.ClassName
        System.out.println(Dolu.a);// space char 
        System.out.println(Dolu.b);//false

        //Object Reference Variable
        Dolu d1 = new Dolu();
        System.out.println(Dolu.a);// space char
        System.out.println(Dolu.b);//false


    }
    
}
