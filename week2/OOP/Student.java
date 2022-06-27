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

    //To String
    // @Override
    // public String toString(){
    //     return "I really did not want to be a string, so says " + super.getFname();
    // }
    //public method which uses a private member
    //auto generate equals override method.
    //Source Action -> Generate Hash Code and Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (studentid != other.studentid)
            return false;
        return true;
    }

}
