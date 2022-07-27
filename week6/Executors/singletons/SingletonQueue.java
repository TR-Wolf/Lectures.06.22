package Executors.singletons;

import java.util.LinkedList;
import java.util.Queue;

public class SingletonQueue {
    private static SingletonQueue singletonQueue;
    private static Queue<String> queue;

    public static synchronized SingletonQueue getInstance() {
        if (singletonQueue == null) {
            singletonQueue = new SingletonQueue();
        }
        return singletonQueue;
    }

    private SingletonQueue() {
        queue = new LinkedList();
    }

    public static String deQueue() {
        return queue.poll();
    }

    public static void queue(String str) {
        queue.add(str);
    }

    public static boolean queueIsNotEmpty() {
        return queue.size() > 0;
    }
}
