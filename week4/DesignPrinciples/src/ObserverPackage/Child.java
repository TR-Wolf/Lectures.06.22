package ObserverPackage;

public class Child {
    private Parent mom;
    private School school;

    public Child() {
        school = School.ELEMENTARY;
    }
    public void graduateSchool(){
        switch (school){
            case ELEMENTARY:
                school = School.SECONDARY;
                break;
            case SECONDARY:
                school = School.PRIMARY;
            case PRIMARY:
                school = School.NONE;
                break;
            default:
                school = School.NONE;
                break;
        }
        System.out.println("Hey mom, I graduated!");
        mom.childGraduated(school, this);
    }

    public Parent getMom() {
        return mom;
    }

    public void setMom(Parent mom) {
        this.mom = mom;
    }

    public School getSchool() {
        return school;
    }
}
