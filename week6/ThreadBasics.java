public class ThreadBasics {
    public static void main(String[] args) throws InterruptedException {
        Chef spongeBob = new Chef();
        final Boolean[] burgerCooked = {false};

        Thread chefThread = new Thread(new Runnable() {
            @Override
            public void run() {
                spongeBob.fryBurger();
                burgerCooked[0] = true;
            }
        });

        log("Okay how can I take your order?");
        log("burger? okay got it. SPONGEBOB!!!!");
        chefThread.start();
        while (!burgerCooked[0]) {
            System.out.println("... waiting...");
            Thread.sleep(2000);
        }
        chefThread.join();

        log("Your burger is ready!!!!! Enjoy!");
    }

    private static void log(String s){
        System.out.println("Squidward: \"" + s + "\"");
    }
}
