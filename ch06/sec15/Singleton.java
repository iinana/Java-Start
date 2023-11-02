package ch06.sec15;

public class Singleton {
    // private object
    private static Singleton singleton = new Singleton();
    // private constructor
    private Singleton() {
    };

    // public method (the only way to access to object)
    public static Singleton getInstance() {
        return singleton;
    }
}
