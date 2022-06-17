package OOP;

public class Student extends Person{
    //Private members
    private int studentid;
    private static int idcounter = 0;
    
    //constructor
    public Student(String fname, String lname){
        super(fname, lname);
        studentid = idcounter++; //Don't need "this." although it is always good practice.
    }

    //public method which uses a private member
    //auto generate equals override method.
    //Source Action -> Generate Hash Code and Equals
}
