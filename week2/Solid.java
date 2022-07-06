package week2;

import java.util.ArrayList;
import java.util.List;

//Sources:
//https://www.infoworld.com/article/2971271/exploring-the-liskov-substitution-principle.html#:~:text=Liskov%20Substitution%20Principle%20is%20an,virtual%20in%20the%20base%20class.
//https://www.bmc.com/blogs/solid-design-principles/#:~:text=SOLID%20is%20an%20acronym%20that,some%20important%20benefits%20for%20developers.


/*public class*/
public class Solid {
    private int x;
    public static void main(String[] args) {
        s();
        o();
        l();
        i();
        d();
        g = 5;
        otherExamples();
    }

    //Single Responsibility
    //Each class should only solve one problem
    public static void s () {
        //Radar Handler
        //Controls radars, launchers and launch commands
        MultipleResponsibilityRadar badRadar = new MultipleResponsibilityRadar();
        badRadar.turn(180);
        badRadar.lockOnTarget(3018);
        badRadar.issueEngagementCommand(3018, 2, 2);
        badRadar.turnLauncher(12, 170);
        badRadar.sendMessageToBase(201, "ENGAGEMENT ISSUED");
        badRadar.refreshScreen();

        SingleResponsibilityRadar goodRadar = new SingleResponsibilityRadar();
        goodRadar.turn(20);
        goodRadar.lockOnTarget(3018);
        Launcher launcherOne = goodRadar.getLaunchers().get(1);
        launcherOne.engage(3018);
    }

    //Open/Closed Principle
    //Classes should be OPEN for extension
    //Classes should be CLOSED for modification
    public static void o () {
        //If I have an Animal class, rather than giving it
        //methods for flying, and updating it's movement methods
        //to consider this, I should NOT modify it, and I can
        //extend it instead.
    }
    
    //Liskov Substitution Principle
    public static void l () {
        //derived classes should be replaceable for their base types, 
        //  i.e., a reference to a base class should be replaceable 
        //  with a derived class without affecting the behavior
    
        //Example, Rectangle as a Parent class, and Square as its child
        Rectangle rect = new Rectangle();
        rect.setHeight(20);
        rect.setWidth(5);

        Rectangle square = new Square();
        square.setHeight(20);
        square.setWidth(5);
        
        //add them to an array
        Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = rect;
        rectangles[1] = square;

        //The problem here is we, within this method, think that
        //we have two rectangles with the same height and width
        //but we see we have two different
        for (Rectangle rectangle : rectangles) {
            System.out.println("Area for this rectangle: " + rectangle.area());
        }
    }
    
    //Interface Segregation
    //It is better to have a lot of small interfaces 
    //than to have a little amount of big ones.
    public static void i () {
        //Examples:
        //Animal as an interface with abstract methods
            //fly(), walk(), run(), climb(), eat(), 
            //groomSelf(), bark(), yell(), sing(), sleep()
        
        //As opposed to
        //Animal
            //eat(), walk(), sleep()
                //Bird
                    //fly(), sing()
                //Dog
                    //bark(), run()
                //Monkey
                    //climb(), yell()
        //why should a dog need to have an implementation for climbing?
    }

    //Dependency Inversion Principle
    //"depend on abstractions, not on concretions."
    public static void d () {
        //In short, make one interface for two classes,
        //rather than have them depend upon each other for having
        //specific implementations

        //Rectangle depends on having width and length being different
        
        //Square depends on the use of two variables, width and height

        //It would be better to have a Quadrilateral Interface:
        //public interface Quadrilateral {
        //    getArea();
        //}
        //This way there is no confusion or dependency problems
        //with either of the classes
    }


    //other examples
    public static void otherExamples () {
        //++~~*~*~~ Inner classes: Velocity Example ~~*~*~~++
        List<Velocity> speeds = new ArrayList<>();
        int time = 0;
        speeds.add(new Velocity(0.5, 2.3, 4.2, time++));
        speeds.add(new Velocity(1.0, 2.3, 4.2, time++));
        speeds.add(new Velocity(2.0, 2.3, 4.2, time++));

        double acceleration = calculateAcceleration(speeds);

        //++~~*~*~~  Enumerators ~~*~*~~++
        GameMode mode = GameMode.NONE;
        int userChoice = getChoiceFromUser();
        switch (userChoice) {
            case 1:
                mode = GameMode.EASY;
            break;
            case 2:
                mode = GameMode.MEDIUM;
            break;
            case 3:
                mode = GameMode.HARD;
            break;
            case 4:
                System.out.println("Thanks for playing");
            break;
            default:
                System.out.println("Invalid input, try again.");
            break;
        }
        int userGuess = 8;
        int systemChoice = 9;
        boolean win = false;
        //Who wins
        switch (mode) {
            case EASY:
                if (userGuess >= systemChoice) {
                    win = true;
                }
            break;
            case MEDIUM:
                if (userGuess > systemChoice) {
                    win = true;
                }
            break;
            case HARD:
                if (userGuess == systemChoice) {
                    win = true;
                }
            break;
            default:
                System.out.println("You shouldn't be here, you broke the game!");
            break;
        }
        //++~~*~*~~  packages  ~~*~*~~++

        //++~~*~*~~  access modifiers  ~~*~*~~++
    }
    
    //inner class
    public static class Velocity {
        double x;
        double y;
        double z;
        int timeFrame;
        Velocity(double a, double b, double c, int timeFrame) {
            x = a;
            y = b;
            x = c;
            this.timeFrame = timeFrame;
        }
    }

    private static double calculateAcceleration(List<Solid.Velocity> speeds) {
        return 2.0;
    }
    
    //Enums
    public enum GameMode {
        EASY, MEDIUM, HARD, NONE;
    }
    static int getChoiceFromUser(){
        return 1;
    }




    interface Radar {
        void turn(int degrees);
        void refreshScreen();
        void lockOnTarget();
    }
    static class MultipleResponsibilityRadar{
        public final int MAX_LAUNCHERS = 16;
        public final int MAX_MISSILES = 4;
        private int[] launcherPTL = new int[MAX_LAUNCHERS];
        private int[][] MissileLoad = new int[MAX_LAUNCHERS][MAX_MISSILES];

        public void lockOnTarget(int targetID){}
        public void issueEngagementCommand(int targetID, int launcherNumber, int missileBarrelNumber){}
        public void turnLauncher(int launcherNumber, int degrees) {}
        public void sendMessageToBase(int radioFrequency, String message){}

        public void turn(int degrees) {
        }
        public void refreshScreen() {
        }
        public void lockOnTarget() {
        }
    }

    static class Rectangle {
        private double width;
        private double height;

        Rectangle () {  }

        public double area(){
            return width * height;
        }
        public void setWidth(double width) {
            this.width = width;
        }
        public void setHeight(double height) {
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }
        
    }
    
    static class Square extends Rectangle {
        Square(){
            super();
        }
        @Override
        public void setHeight (double h) {
            super.width = h;
        }
        @Override
        public double area () {
            return super.width * super.width;
        }
    }
    static class SingleResponsibilityRadar {
        List<Launcher> launchers = new ArrayList<>();
        SingleResponsibilityRadar() {
            launchers.add(new Launcher());
            launchers.add(new Launcher());
        }
        public void turn(int degrees) {
        }
        public void refreshScreen() {
        }
        public void lockOnTarget(int targetID) {
        }
        public List<Launcher> getLaunchers(){
            return launchers;
        }
    }
    static class coneRadar extends SingleResponsibilityRadar {

    }
    static class Launcher {
        int g;
        public void engage(int targetID){
            s();
        }
    }
}
