class PersonDriver {

    public static void main(String[] args) {

    Person p1 = new Person();
    Person p2 = new Person();
    Person p3 = new Person();

    Person p4 = p3;
    

    System.out.println(p3==p2);
    System.out.println(p4==p2);
    System.out.println(p3==p1);

        
    }

    
    
}
