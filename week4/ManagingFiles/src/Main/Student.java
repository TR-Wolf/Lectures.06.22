package Main;

import java.io.Serializable;

public class Student implements Serializable {
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

    public Student(){

    }

    @Override
    public String toString() {
        return studentNumber + ", " + firstName + ", " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }
}
