public class DesignRunner {
    public static void main(String[] args) {
        String one = "I am a unique instance of the String Class";
        String two = "I am another unique instance of the String Class";
        log(one);
        log(two);

        SingletonString ssOne = SingletonString.getInstance();
        SingletonString ssTwo = SingletonString.getInstance();
        SingletonString ssThree = SingletonString.getInstance();

        printSingleton(ssOne.getString(), ssTwo.getString(), ssThree.getString());

        ssOne.setString("I am SS One, I am the best Singleton");
        ssTwo.setString("I don't care what ssOne thinks");
        ssThree.setString("We all share one String, guys...");

        printSingleton(ssOne.getString(), ssTwo.getString(), ssThree.getString());

    }
    public static void log(String s) {
        System.out.println(s);
    }

    public static void printSingleton(String s1, String s2, String s3) {
        log("Singleton Strings Current State:");
        System.out.print("s1:");log(s1);
        System.out.print("s2:");log(s2);
        System.out.print("s3:");log(s3);
    }
}
