package MainPackage;

import CompositePackage.Base;
import SingletonPackage.SingletonString;
import FactoryPackage.*;
import FacadePackage.*;
import AdapterPackage.*;
import ObserverPackage.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Example choice = Example.ADAPTER;

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
        SingletonString ssOne = SingletonString.getMyStringSingletonPlease();
        SingletonString ssTwo = SingletonString.getMyStringSingletonPlease();
        SingletonString ssThree = SingletonString.getMyStringSingletonPlease();

        //Trying with Static
        SingletonString.setString("I am setting statically");
        log(SingletonString.getString());
        //What will we see?
        printSingleton(ssOne.getString(), ssTwo.getString(), ssThree.getString());

        //and if we change each one?
        ssOne.setString("Hello World");
        ssTwo.setString("Hello Class");

        //What will we see?
        printSingleton(ssOne.getString(), ssTwo.getString(), ssThree.getString());

        //Again? now what will we see?
        ssThree.setString("Will I be seen? :(");
        ssOne.setString("I override all updates.");



        printSingleton(ssOne.getString(), ssTwo.getString(), ssThree.getString());

        // Warning, don't use these if you need to do unit testing.
        // - we want you to understand how these work in case you see them
        // or more rarely you need to use them for a specific use-case.

        //Why?
        //Score-Keeping Example
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
        Main.runMain(); // I can run this since it is a static method
    }

    /******************************* Facade *******************************/
    public static void facadeExample() {
        // NON FACADE
        NonFacadeNumberGame.runGame();

        // FACADE
        FacadeNumberGame game = new FacadeNumberGame();
        Scanner sc = game.generateScanner();
        game.createBufferedImage();
        game.getDifficulty(sc);
        game.printDifficulty();
        game.generateNumber();
        game.getUserNumber(sc);
        game.printWinner();
    }

    /******************************* Adapter *******************************/
    public static void adapterExample() {
        // Consider this just an extension of the SOLID design principle O,
        // Open for extension, closed for modification.
        // Rather than change a main class, we will create a new class/interface.
        //Doctor doctorSurgeon = new Doctor("House", "Infectious Diseases");

        //What if we want this doctor to be capable of Surgery, do we give it the ability
        Surgeon surgeon = new Surgeon("Mansion", "Infectious Organs");

        surgeon.addPatient(new Patient("Thomas", "Cardiology"));
        surgeon.beginSurgery("Open Heart Surgery");
        surgeon.removePatient();

        List<Surgeon> surgeons;
    }

    /******************************* Composite *******************************/
    public static void compositeExample() {
        Base baseOfOakTree = new Base();
        baseOfOakTree.wind();

        //Navigation Menu
        //MenuItem
        //file- folder
        //      base folder
        //           /         \
        //     subfolder 1    subfolder 2   file
        //         /                 \
        //     subfolders           files


        //Group messaging
        // Group
        // All Contacts
        //  /                 \
        // Family group       RandomGuy
        //  / | \
        //  Family member1, ...
    }

    /******************************* Observer *******************************/
    public static void observerExample() {
        Parent mom = new Parent();
        Child child = new Child();
        child.setMom(mom);
        mom.addChild(child);

        //Now let's see what happens when the child graduates!
        child.graduateSchool();
        //I don't need to tell the parent.

        child.graduateSchool();
    }
}
