package Main;

public class Student {
    private String firstName;
    private String lastName;
    private int studentNumber;

    //Constructor with student id
    public Student(String firstName, String lastName, int studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }
    //constructor which generates student id
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = this.hashCode();
    }

    @Override
    public String toString() {
        return studentNumber + ", " + firstName + ", " + lastName;
    }
}
