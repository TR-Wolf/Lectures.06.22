package SingletonPackage;

public class SingletonString {
    private static SingletonString singleton;
    private String myString;
    private SingletonString() {
        myString = "Default String";
    }

    public static SingletonString getInstance() {
        if (singleton == null) {
            singleton = new SingletonString();
        }
        return singleton;
    }

    public void setString(String s){
        myString = s;
    }

    public String getString() {
        return myString;
    }
}
