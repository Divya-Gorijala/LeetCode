package design_pattern;

public class SingletonExample {
    // The instance is created at the time of class loading.
    private static final SingletonExample INSTANCE = new SingletonExample();

    // Private constructor to restrict instantiation.
    private SingletonExample() {}

    // Global access point to get the instance.
    public static SingletonExample getInstance(){
        return INSTANCE;
    }

}

