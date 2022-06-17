package OOP;

public class Student extends Person{
    //Private members
    private int studentid;

    //constructor
    public Student(String fname, String lname, int id){
        this.fname = fname;
        this.lname = lname;
        studentid = id; //Don't need "this." although it is always good practice.
    }
    
    //public method which uses a private member
    public boolean idMatch(int id){
        if (id == studentid){
            return true;
        } else {
            return false;
        }
    }
}
