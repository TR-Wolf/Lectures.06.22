public class ThreadBasics {
    private static Boolean burgerCooked;
    public static void main(String[] args) {
        // Getting the current thread that is running
        Thread theMainThread = Thread.currentThread();

        // What methods do we have access to?
//        theMainThread.start();


        // Information about thread, getters:
//        System.out.println("    Name: " + theMainThread.getName());
//        System.out.println("      ID: " + theMainThread.getId());
//        System.out.println("   Alive: " + theMainThread.isAlive());
//        System.out.println("Priority: " + theMainThread.getPriority());
//        System.out.println("Daemon: " + theMainThread.isDaemon());

//        // Daemon threads are low priority threads that can run in the background.
//        // The JVM does not wait for daemon threads before exiting.


        // Before running into the Krusty Krab for a burger,
        // let's cover sleeping...

//        System.out.println("Going to sleep -.-");
//        Thread.sleep(2500);
//        System.out.println("I am awake! o.o");

        // What if there are two threads, and one is asleep?

        /********* THE KRUSTY KRAB EXAMPLE ***********/
//        // After example, see if someone asks why I made this a global variable.
//        burgerCooked = false;
//
//        // Creating a Chef Thread using new Runnable() to create Override.
//        // Is Runnable a functional interface? let's take a look. ->...
//        // Can we turn this into a lambda expression y/n? (Incoming random student request)
//        Thread chefThread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Sponge Bob: Alright Squidward! It's on the grill!");
//                int cookTime = (int)(5000);
//                // Why do I need to have a try statement here?
//                // Doesn't the Main Thread have a throws clause?
//                try {
//                    Thread.sleep(cookTime);
//                    System.out.println("Sponge Bob: \"*tsssss* it's gettin hot!\"");
//                    Thread.sleep(cookTime);
//                    System.out.println("Sponge Bob: \"Now for some bread, lettuce and tomato.\"");
//                    Thread.sleep(cookTime);
//                    System.out.println("Sponge Bob: \"The burger is ready!\"");
//                } catch (Exception e) {
//                    System.out.println("Sponge Bob: \" Squidward, I am scared, I think there was an exception\"");
//                }
//                burgerCooked = true;
//            }
//        });
//
//        // (Afterwards) Create Chef Thread from a Runnable Class instead.
//        // Use constructor (Runnable object, String threadName)
//        Thread chefThread2 = new Thread();
//
//        log("Okay how can I take your order?");
//        log("burger? okay got it. SPONGEBOB!!!!");
//        chefThread.start();
//        while (!burgerCooked) {
//            log("waiting on Sponge Bob.....");
//            Thread.sleep(2000);
//        }
//        // What if we didn't have the loop above?
//        // chefThread.join();
//        if (burgerCooked) {
//            log("Your burger is ready!!!!! Enjoy!");
//        } else {
//            log("Your burger isn't ready, but it is " +
//                    "time for me to clock out of work, bye.");
//        }
        /********** End of the Krusty Krab Example **********/

        //// Thread States
        System.out.println("\n Post Krusty krab, the state of main thread is: " +
                            theMainThread.getState());
        // goto -> getState
        // goto -> State Enumeration
        // discuss.

        // Time to ask for student understanding

        // What is a thread?
        // ...

        // Sleeping a Thread?
        // ...

        // Runnable?
        // ...

        // The Interrupted Exception?
        // ...

        // Thread.start()
        // ...

        // Thread.join()
        // ...

        // (The above two with an input integer)?

        // Thread.getState()
        // ...


    }

    private static void log(String s){
        System.out.println("Squidward: \"" + s + "\"");
    }

}


// Implementing a Runnable class (although you may extend Thread, let's do it like this)
//class localChef implements Runnable {
//}
