package OOP;

public class Teacher extends Person {
    
    //Needs its own constructor
    public Teacher(String fname, String lname) {
        super(fname, lname);
    }
    //Calling super will call Person Constructor ->
    // public Person(String fname, String lname) {
    //     this.fname = fname;
    //     this.lname = lname;
    // }

    //Giving it a new introduction method, which is unique.
    @Override
    public String introduction(){
        String name = super.introduction() + '\n';
        name += "I will be your instructor for the Flatiron Java Course!";
        return name;
    }



}
