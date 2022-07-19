public class LambdaExpressionsRunner {
    public static void main(String[] args) {
        //// Functional Interface
        //Print interface - class with print
        Printable[] myPrintableObjects = {new Dog(), new Cat(), new Human(), new Dog()};
        new Human().print("Thomas");
        // what can I do with all of these objects?
        for (int i = 0; i < myPrintableObjects.length; i++) {
            Printable thisAnimal = myPrintableObjects[i];
            thisAnimal.print();
        }

        //// Lambda Expressions
        // Basic:    () -> oneLineOfCode;
        // With Parameters (type param) -> oneLineOfCode;
        // With more code  (type param) -> { code; code; code; };

        // We can declare a lambda expression as a functional interface.
        Printable sayHello = () -> System.out.println("Hello World");
        sayHello.print();

        Printable horse = () -> System.out.println("Naaaaaaaaay!... pbbllelelblbleehh");

        // what can I do with these "printable expressions" (since they aren't objects)
        horse.print();

//        interface Loggable {
//            String log(String time, String str);
//        }
        // With parameters (Loggable)
        Loggable picard = (date, str) -> {
            String ret = "*~~*~~-.-.-....__....___  .  . .  . .\n";
            ret += "Star Date, + "+ date+".\n";
            ret += "Captains log: \n" + str;
            ret += "\n*~~*~~-.-.-....__....___  .  . .  . .\n";
            return ret;
        };

//        Loggable picard = new Picard();

        captainsLog(picard);

        // Why a functional interface?

        // Code depending on that functional interface
        // Using an actual object which implements printable
        printThrice(new Cat());
        // Using a lambda expression which pretends
        // that it is an object, who's print method
        // is the lambda's expression's definition

        printThrice(
                () -> {
                    System.out.println("I am on the inside of ");
                    System.out.println(" a lambda expression");
                    System.out.println("I am being sent to printThrice");
                    System.out.println("and i will be printed");
                }
        );

        //// Lambda Scope
        // Refresher: what is the scope of an object (inside a class, or a method)?
        // the same for a lambda.

        //let's create a new logger
//        int count = 0;// <- can we add this? after
        Loggable countLogger = (time, str) -> {
            int count = 0;
            System.out.println("Time:" + time);
            System.out.println("I can count to  " + count++);
            System.out.println("and now it's a  " + count++);
            System.out.println("and ill stop at " + count++);
            System.out.println("Oh and the string input is: " + str);
            return "";
        };

        countLogger.log("8:20", "I do not like counting");
        countLogger.log("8;21","Maybe it's not bad");
        //System.out.println(count);

    }

    static void printThrice(Printable object) {
        System.out.println("This 'object' has a print method as far as I am aware.");
        object.print();
        object.print();
        object.print();
    }

    static void captainsLog(Loggable picard) {
        String log1 = picard.log("July 19th 2022 09 Hundred Hours", "I woke up this morning and had a cup of tea, earl gray, hot.\n" +
                "I thought I heard a voice from the window, but when I looked\n" +
                "All I saw was empty space, empty and quiet.");
        String log2 = picard.log("July 19th 2022 10 Hundred Hours", "It appears now, that Lieutenant Data was beamed into space this morning.");

        System.out.println(log1);
        System.out.println(log2);
    }
}

/************** Printable Implementations **************/
class Dog implements Printable {
    public void print() {
        System.out.println("Bark Bark Bark!");
    }
}

class Cat implements  Printable {
    public void print() {
        System.out.println("Meeeeoowwwwww....");
        System.out.println("Meow? Meoww??");
    }
}
class Human implements Printable {
    private String name;
    private int social;

    public void print() {
        System.out.println("Blah Blah Blah, I am a human who thinks stuff blaaah, blah. ");
    }

    public void getName(){

    }
    public void setName (){

    }

    //Human is soooo special that it has to overload the print method
    public void print(String str) {
        System.out.println("and my name is! " + str);
    }
}



/************** Functional Interface **************/
@FunctionalInterface
interface Printable {
    void print();
}

@FunctionalInterface
interface Loggable {
    String log(String time, String str);
}