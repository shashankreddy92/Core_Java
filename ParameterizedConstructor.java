class ParameterizedConstructor {

    //non-static variables
    String name;
    int student_id;
    double cgpa;

    ParameterizedConstructor(String name,int student_id,double cgpa)
    {
        //load object instruction
        this.name = name;//this is a keyword which is storing current object addess
        this.student_id = student_id;
        this.cgpa = cgpa;
    }

    public void printStudentDetails()
    {
        System.out.println("Name : "+name);
        System.out.println("Student id : "+student_id);
        System.out.println("CGPA : "+cgpa);
    }
    
}
