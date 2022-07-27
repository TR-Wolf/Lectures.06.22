package Executors.singletons;

public class SingletonBoolean {
    private static SingletonBoolean singletonBoolean;
    private static Boolean bool;

    public static SingletonBoolean getInstance() {
        if (singletonBoolean == null) {
            singletonBoolean = new SingletonBoolean();
        }
        return singletonBoolean;
    }

    private SingletonBoolean() {
        bool = new Boolean(true);
    }

    public static Boolean getBoolean() {
        return bool;
    }

    public static void setBoolean(Boolean bool) {
        SingletonBoolean.bool = bool;
    }
}
