class StaticMembersInSameClass {
    //same class - static members can be accessed 3 ways

    static int a;
    static double b;

    public static void main(String[] args) {
        
        //Directly
        System.out.println(a);//0
        System.out.println(b);//0.0

        //ClassName
        System.out.println(StaticMembersInSameClass.a);//0
        System.out.println(StaticMembersInSameClass.b);//0.0

        //Object Reference Variable
        StaticMembersInSameClass a1 = new StaticMembersInSameClass();
        System.out.println(StaticMembersInSameClass.a);//0
        System.out.println(StaticMembersInSameClass.b);//0.0
    }
    
}
