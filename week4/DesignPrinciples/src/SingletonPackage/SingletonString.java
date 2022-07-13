package SingletonPackage;

public class SingletonString {
    private static SingletonString singleton;
    private static String myString;

    private SingletonString() {
        myString = "Default String";
    }

    public static SingletonString getMyStringSingletonPlease() {
        if (singleton == null) {
            singleton = new SingletonString();
        }
        return singleton;
    }

    public static void setString(String s){
        myString = s;
    }

    public static String getString() {
        return myString;
    }
}

