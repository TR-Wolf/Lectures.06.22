package Executors;

import Executors.singletons.SingletonBoolean;
import Executors.threads.Chef;
import Executors.threads.Register;

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


        // Open the store (with singleton boolean)
        SingletonBoolean storeOpen = SingletonBoolean.getInstance();
        storeOpen.setBoolean(true);

        // Re-using simple example from basics lecture
        Runnable spongebob = new Chef();
        Runnable squidward = new Register();

        // Executor begins both threads for us.
        /********* SimpleExecutor *********/
        Executor simpleExecutor = new SimpleExecutor();

        /********* newSingleThreadExecutor *********/
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        /********* newCachedThreadPool *********/
        ExecutorService cachedExecutor = Executors.newCachedThreadPool();

        /********* newScheduledThreadPool *********/
        ScheduledExecutorService scheduleExecutor = Executors.newScheduledThreadPool(3);

        //// Calling the executor

        // When executing a regular executor,
        // Squidward and spongebob are working at the same time.
//        simpleExecutor.execute(squidward);
//        simpleExecutor.execute(spongebob);

        // When executing a single thread executor,
        // Squidward and spongebob are showing up to work
        // one after another.
//        singleThreadExecutor.execute(squidward);
//        singleThreadExecutor.execute(spongebob);

        // When executing a cached thread pool executor,
        // Squidward and spongebob are working at the same time.
//        cachedExecutor.execute(squidward);
//        cachedExecutor.execute(spongebob);

        // Squidward and spongebob are working at the same time.
//        scheduleExecutor.execute(spongebob);
//        scheduleExecutor.execute(squidward);

        // Squidward and spongebob are working at a certain time (and a certain amount of times).
        // This part you aren't being tested over, I
        // am including it just for your benefit:
//        scheduleExecutor.scheduleAtFixedRate(squidward, 8, 3, TimeUnit.SECONDS);
//        scheduleExecutor.scheduleAtFixedRate(spongebob, 10, 3, TimeUnit.SECONDS);

        // Let the krusty krab run for 30 seconds before shutting it down.
//        try {
//            Thread.sleep(16_000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        storeOpen.setBoolean(false);



        /******************** Callable ********************/
        Callable callableObject;
        // Functional Interface with method:
        // <V> call() throws Exception
        callableObject = new CallableString();

        Future futureObject = singleThreadExecutor.submit(callableObject);

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

//        System.out.println("Let's cancel the future!" + futureObject.cancel(true));
//        System.out.println("is future canceled?     " + futureObject.isCancelled());
//        System.out.println("is the future done yet? " + futureObject.isDone());;
        System.out.println(futureObject.get());


        singleThreadExecutor.shutdown();
        cachedExecutor.shutdown();
        scheduleExecutor.shutdown();
    }
}
