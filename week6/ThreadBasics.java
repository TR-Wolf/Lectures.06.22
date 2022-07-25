public class ThreadBasics {
    private static Boolean burgerCooked;
    public static void main(String[] args) throws InterruptedException {
        // Getting the current thread that is running
        Thread theMainThread = Thread.currentThread();

        // What methods do we have access to?
//        theMainThread.;


        // Information about thread, getters:
//        System.out.println("    Name: " + theMainThread.getName());
//        System.out.println("      ID: " + theMainThread.getId());
//        System.out.println("   Alive: " + theMainThread.isAlive());
//        System.out.println("Priority: " + theMainThread.getPriority());
//        System.out.println("Daemon: " + theMainThread.isDaemon());

        // Daemon threads are low priority threads that can run in the background.
        // The JVM does not wait for daemon threads before exiting.


        // Before running into the Krusty Krab for a burger,
        // let's cover sleeping...

//        System.out.println("Going to sleep -.-");
//        // This is me calling the Thread class statically.
        Thread.sleep(2500);
//        // I can call sleep for this instance of Thread. (but why would you want to?)
//        System.out.println("and instance ref to sleep?");
//        theMainThread.sleep(2500);
//
//        System.out.println("I am awake! o.o");

        // What if there are two threads, and one is asleep?

        /********* THE KRUSTY KRAB EXAMPLE ***********/
        // After example, see if someone asks why I made this a global variable.
        burgerCooked = false;

        // Creating a Chef Thread using new Runnable() to create Override.
        // Is Runnable a functional interface? let's take a look. ->...
        // Can we turn this into a lambda expression y/n? (Incoming random student request)
        // maybe not
//        Thread chefThread = new Thread(() -> {
//            System.out.println("Sponge Bob: Alright Squidward! It's on the grill!");
//            int cookTime = (int)(6000);
//            // Why do I need to have a try statement here?
//            // Doesn't the Main Thread have a throws clause?
//            try {
//                Thread.sleep(cookTime/2);
//                System.out.println("Sponge Bob: \"*tsssss* it's gettin hot!\"");
//                Thread.sleep(cookTime/2);
//                System.out.println("Sponge Bob: \"Now for some bread, lettuce and tomato.\"");
//                Thread.sleep(cookTime);
//                System.out.println("Sponge Bob: \"The burger is ready!\"");
//            } catch (Exception e) {
//                System.out.println("Sponge Bob: \" Squidward, I am scared, I think there was an exception\"");
//            }
//            burgerCooked = true;
//        });

        // (Afterwards) Create Chef Thread from a Runnable Class instead.
        // Use constructor (Runnable object, String threadName)
        Thread chefThread = new Thread(new LocalChef(), "Spongebob");

        log("Okay how can I take your order?");
        log("burger? okay got it. SPONGEBOB!!!!");
        System.out.println("\n The state of spongebob thread is: " +
                chefThread.getState());
        chefThread.start();
//        while (!burgerCooked) {
//            log("waiting on Sponge Bob.....");
//            Thread.sleep(2000);
//        }
        // What if we didn't have the loop above?
        // we can use join
        System.out.println("\n The state of spongebob thread is: " +
                chefThread.getState());
        chefThread.join();

        if (burgerCooked) {
            log("Your burger is ready!!!!! Enjoy!");
            log("i'm clocking out of work now");
        } else {
            log("Your burger isn't ready, but it is " +
                    "time for me to clock out of work, bye.");
        }
        /********** End of the Krusty Krab Example **********/

        //// Thread States
        System.out.println("\n The state of spongebob thread is: " +
                chefThread.getState());
        System.out.println("\n Post Krusty krab, the state of main thread is: " +
                            theMainThread.getState() +
                            "\n Post Krusty krab, the state of spongebob thread is: " +
                            chefThread.getState());
        // goto -> getState
        // goto -> State Enumeration
        // discuss.

        // Time to ask for student understanding

        // What is a thread?
        // ...

        // Runnable Class. - run() method implemented
        // Can be nested, or declared somewhere else.
        // Runs a process at the same time (multi-threading)
        //    ** synchronous processes <- can't be interrupted **
        //    ** asynchronous <- threads **
        // Basic unit of task execution.
        // has a state for itself.

        // Sleeping a Thread?
        // ...
        // Thread.sleep( time in milliseconds)
        // -thread waits for period of time.

        // Runnable?
        // ...
        // can be implemented -- Interface
        // as opposed to extending -- Class - Thread Class

        // The Interrupted Exception?
        // ...
        // Exception that is thrown when program is interrupted
        // happens during multithreading, or when using sleep.

        // Thread.start()
        // ...
        // Begins the thread.

        // Thread.join()
        // ...
        // waits for the thread to stop before proceeding.

        // (The above two with an input integer)?
//        theMainThread.join(2500);

        // Thread.getState()
        // ...
        // Tells you if a thread is:
        // New, running, terminated.

        // Last Questions?...
        // Have to start a thread?
        //   yes,
        // Do we have to wait for it to terminate?
        //   no.
        //   Spongebob has to be ready to cook,
        //   before asking him to cook.

    }

    private static void log(String s){
        System.out.println("Squidward: \"" + s + "\"");
    }

    //Spongebob
    static class LocalChef implements Runnable {
        @Override
        public void run() {
            System.out.println("Sponge Bob: Alright Squidward! It's on the grill!");
            // Why do I need to have a try statement here?
            // Doesn't the Main Thread have a throws clause?
            System.out.println("Sponge Bob: \"*tsssss* it's gettin hot!\"");
            System.out.println("Sponge Bob: \"Now for some bread, lettuce and tomato.\"");
            System.out.println("Sponge Bob: \"The burger is ready!\"");
            burgerCooked = true;
        }
    }
}


// Implementing a Runnable class (although you may extend Thread, let's do it like this)

