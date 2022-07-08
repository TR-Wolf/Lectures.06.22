package MainPackage;

import SingletonPackage.SingletonString;
import FactoryPackage.*;

public class DesignRunner {
    public enum Example {
        SINGLETON,
        FACTORY,
        FACADE,
        ADAPTER,
        COMPOSITE,
        OBSERVER
    }
    //Main method to run an example of each Design Principle
    public static void main(String[] args) {
        Example choice = Example.FACADE;

        switch (choice) {
            case SINGLETON:
                singletonExample();
                break;
            case FACTORY:
                factoryExample();
                break;
            case FACADE:
                facadeExample();
                break;
            case ADAPTER:
                adapterExample();
                break;
            case COMPOSITE:
                compositeExample();
                break;
            case OBSERVER:
                observerExample();
                break;
            default:
                System.out.println("No default example");
                break;

        }
    }

    /******************************* Singleton *******************************/
    public static void singletonExample(){
        String one = "I am a unique instance of the String Class";
        String two = "I am another unique instance of the String Class";
        log(one);
        log(two);


        //Now lets create 3 Singletons
        SingletonString ssOne = SingletonString.getInstance();
        SingletonString ssTwo = SingletonString.getInstance();
        SingletonString ssThree = SingletonString.getInstance();

        //What will we see?
        printSingleton(ssOne.getString(), ssTwo.getString(), ssThree.getString());

        //and if we change each one?

        //What will we see?
        printSingleton(ssOne.getString(), ssTwo.getString(), ssThree.getString());

        //Again? now what will we see?

        printSingleton(ssOne.getString(), ssTwo.getString(), ssThree.getString());

        //Implement a basic logger!
//        Logger logger = Logger.getInstance();

        //log a few times
//        Logger secondLogger = Logger.getInstance();

//        logger.log("Hello World!");
//        secondLogger.log("Hello World, from somewhere entirely different!");

    }
    class Logger {
        private int lineNumber;
        //we need a constructor...

        //and a get instance method...

        //public method which provides a utility
    }
    public static void log(String s) {
        System.out.println(s);
    }

    public static void printSingleton(String s1, String s2, String s3) {
        log("Singleton Strings Current State:");
        System.out.print("s1:");log(s1);
        System.out.print("s2:");log(s2);
        System.out.print("s3:");log(s3);
    }

    /******************************* Factory *******************************/
    public static void factoryExample() {
        // First let's open a different project!
        // Trivia Games Supplier!
        FactoryMain.runMain(); // I can run this since it is a static method
    }

    /******************************* Facade *******************************/
    public static void facadeExample() {

    }

    /******************************* Adapter *******************************/
    public static void adapterExample() {

    }

    /******************************* Composite *******************************/
    public static void compositeExample() {

    }

    /******************************* Observer *******************************/
    public static void observerExample() {

    }
}
