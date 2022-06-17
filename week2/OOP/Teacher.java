package OOP;

public class Teacher extends Person {
    //Needs its own constructor
    public Teacher(String fname, String lname) {
        super(fname, lname);
    }

    //Giving it a new introduction method, which is unique.
    @Override
    public String introduction(){
        String name = "Hello, my name is " + this.getFname() + " " + this.getLname() + "\n";
        name += "I will be your instructor for the Flatiron Java Course!";
        return name;
    }



}
