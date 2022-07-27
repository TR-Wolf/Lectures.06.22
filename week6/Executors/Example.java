package Executors;

import java.util.concurrent.Executor;

class Example {

    public static void main(String[] args) {
        SimpleExecutor executor = new SimpleExecutor();
        MyTask myTask = new MyTask();
        executor.execute(myTask);
    }

    static class SimpleExecutor implements Executor {
        public void execute(Runnable runnable) {
            Thread newThread = new Thread(runnable);
            newThread.start();
        }
    }

    static class MyTask implements Runnable {
        public void run() {
            System.out.println("MyTask is running");
        }
    }

}