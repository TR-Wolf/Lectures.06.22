package OOP;

public class Person {
    public String fname;
    public String lname;

    public Person(){
    }

    public String toString() {
        String name = "Hi my name is " + this.fname + " " + this.lname;
        return name;
    }
}
