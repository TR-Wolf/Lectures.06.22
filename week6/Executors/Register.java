package Executors;

import java.util.Scanner;

public class Register implements Runnable {
    @Override
    public void run() {
        SingletonQueue orders = SingletonQueue.getInstance();
        SingletonBoolean storeOpen = SingletonBoolean.getInstance();
        Scanner customer = new Scanner(System.in);
        // First PsuedoCode:
        // While the store is open
        //  ask customers to tell us their orders
        //  listen for the next order and add it to the queue.

        // While the store is open
        while (storeOpen.getBoolean()) {
            //sleep for 5 seconds between customers
            try {
                Thread.sleep(5_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(" ... ");
            System.out.println("Squidward : Oh boy another customer");

            //  ask customers to tell us their orders
            System.out.println("Squidward : Welcome to the Krusty Krab.");
            System.out.println("Squidward : How may I take your order.");

            //  listen for the next order and add it to the queue.
            String order = customer.nextLine();
            if (order.length() > 0) {
                order = order.toLowerCase();
                System.out.println("Squidward : Alright that will be one " + order);
                System.out.println("Squidward : Spongebob will bring it to you shortly.");
                // add it to the queue
                orders.queue(order);
            }
        }

        System.out.println("Squidward : I am out of here, good night!");

    }
}
