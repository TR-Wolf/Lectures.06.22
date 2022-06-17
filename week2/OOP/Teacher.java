package OOP;

public class Teacher extends Person {
    //Needs its own constructor
    public Teacher(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    //Giving it a new toString method, which is unique.
    @Override
    public String toString(){
        String name = "Hello, my name is " + this.fname + " " + this.lname + "\n";
        name += "I will be your instructor for the Flatiron Java Course!";
        return name;
    }

}
