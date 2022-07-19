public class LambdaExpressionsRunner {
    public static void main(String[] args) {
        //// Functional Interface
        //Print interface - class with print
        Printable[] myPrintableObjects = {new Dog(), new Cat(), new Human(), new Dog()};
        
        // what can I do with all of these objects?
        for (int i = 0; i < myPrintableObjects.length; i++) {
            Printable thisAnimal = myPrintableObjects[i];
            // ...?
        }

        //// Lambda Expressions
        // Basic:    () -> oneLineOfCode;
        // With Parameters (type param) -> oneLineOfCode;
        // With more code  (type param) -> { code; code; code; };

        // We can declare a lambda expression as a functional interface.
        Printable sayHello = () -> System.out.println("Hello World");

        Printable horse = () -> System.out.println("Naaaaaaaaay!... pbbllelelblbleehh");

        // what can I do with these "printable expressions" (since they aren't objects)
        //sayHello....?

        // With parameters (Loggable)
//        Loggable picard = (str) -> {
//            System.out.println("*~~*~~-.-.-....__....___  .  . .  . .");
//            System.out.println("Star Date, 190722, 09 hundred hours.");
//            System.out.println("Captains log: \n" + str);
//            System.out.println("*~~*~~-.-.-....__....___  .  . .  . .");
//        };
//
//        picard.log("I woke up this morning and had a cup of tea, earl gray, hot.\n" +
//                       "I thought I heard a voice from the window, but when I looked\n" +
//                       "All I saw was empty space, empty and quiet.");
//        picard.log("It appears now, that Lieutenant Data was beamed into space this morning.");

        // Why a functional interface?


        // Code depending on that functional interface
//        printThrice(
//                () -> System.out.println("I would like to be printed three times.")
//        );

        //// Lambda Scope
        // Refresher: what is the scope of an object (inside a class, or a method)?

        // the same for a lambda.

        //let's create a new logger
//        int count = 0; <- can we add this? after
//        Loggable countLogger = (str) -> {
//            int count = 0;
//            System.out.println("I can count to  " + count++);
//            System.out.println("and now it's a  " + count++);
//            System.out.println("and ill stop at " + count++);
//            System.out.println("Oh and the string input is: " + str);
//        };
//
//        countLogger.log("I do not like counting");
//        countLogger.log("Maybe it's not bad");
        //System.out.println(count);


    }

    static void printThrice(Printable object) {
        System.out.println("This 'object' has a print method as far as I am aware.");
        object.print();
        object.print();
        object.print();
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
    public void print() {
        System.out.println("Blah Blah Blah, I am a human who thinks stuff blaaah, blah. ");
    }
}



/************** Functional Interface **************/
@FunctionalInterface
interface Printable {
    void print();
}

@FunctionalInterface
interface Loggable {
    void log(String str);
}