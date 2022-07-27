package Executors.threads;

import Executors.singletons.SingletonBoolean;
import Executors.singletons.SingletonQueue;

public class Chef implements Runnable {
    @Override
    public void run() {
        SingletonQueue orders = SingletonQueue.getInstance();
        SingletonBoolean storeOpen = SingletonBoolean.getInstance();
        System.out.println("ᶦ'ᵐ ʳᵉᵃᵈʸᵎ ᶦᵐ ʳᵉᵃᵈʸᵎ i'm ready, i'm ready, I'm Ready!");
        System.out.println("Hey Squidward, ready for another day of work at the Krusty Krab!");
        // While the store is open
        while (storeOpen.getBoolean()) {
            // Let's wait 7 seconds between clearing orders
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // Let's clear the order queue!
            // in english first...
            // While the orders queue is not empty!
            while (orders.queueIsNotEmpty()) {
                // take the next order off the queue
                String thisOrder = orders.deQueue();

                System.out.println("Sponge Bob : I got your order Squidward!");
                System.out.println("Sponge Bob : Oneeeee " + thisOrder + " coming right up!");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Sponge Bob : Your " + thisOrder + " is Ready!!!");
            }
        }
        System.out.println("Sponge Bob : Awww the day is already over? Good night everyone!");
    }
}
