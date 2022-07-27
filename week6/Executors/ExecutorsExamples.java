package Executors;

import java.util.concurrent.*;

public class ExecutorsExamples {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Creating a very Simple Executor
        // - Create Executor class
        // - implements Executor
        //   - implements execute method
        //   (public void execute(Runnable))
        //     + accepts a Runnable object as input
        //     + expected to create a thread.
        // -

        // Open the store (with singleton boolean)
        SingletonBoolean storeOpen = SingletonBoolean.getInstance();
        storeOpen.setBoolean(true);

        // Re-using simple example from basics lecture
        Chef spongebob = new Chef();
        Register squidward = new Register();

        // Executor begins both threads for us.
        /********* SimpleExecutor *********/
        Executor simpleExecutor = new SimpleExecutor();

        /********* newSingleThreadExecutor *********/
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        /********* newCachedThreadPool *********/
        ExecutorService cachedExecutor = Executors.newCachedThreadPool();

        /********* newScheduledThreadPool *********/
        ScheduledExecutorService scheduleExecutor = Executors.newScheduledThreadPool(1);

        //// Calling the executor

//        simpleExecutor.execute(squidward);
//        simpleExecutor.execute(spongebob);

//        singleThreadExecutor.execute(squidward);
//        singleThreadExecutor.execute(spongebob);

//        cachedExecutor.execute(squidward);
//        cachedExecutor.execute(spongebob);

//        scheduleExecutor.execute(squidward);
//        scheduleExecutor.execute(spongebob);
//        scheduleExecutor.scheduleAtFixedRate();

        try {
            Thread.sleep(30_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        storeOpen.setBoolean(false);

//        storeOpen.setBoolean(true);
//        storeOpen.setBoolean(false);



        /******************** Callable ********************/
        Callable callableObject;
        // Functional Interface with method:
        // <V> call() throws Exception

        callableObject = new CallableString();
        Future futureObject = cachedExecutor.submit(callableObject);

        // Tasks with Callable can be submitted to Executors.
        // Threads are not always ran immediatly,
        // so the Executor returns a Future


        /******************** Future ********************/
        // Interface with the following methods
        // get:         A blocking call that waits for a task to complete
        //              and gets the result. It also accepts a timeout
        //              which defines how long it will wait for task completion.
        //
        // cancel:      Cancels the task if possible.
        // isDone:      It returns true if the task ran successfully.
        // isCancelled: It returns true if cancel was previously called.

    }
}
