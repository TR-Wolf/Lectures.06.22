package Executors;

import java.util.concurrent.Executor;

public class SimpleExecutor implements Executor {

    @Override
    public void execute(Runnable command) {
        Thread newThread = new Thread(command);
        newThread.start();
    }
}
