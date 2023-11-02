package ch06.sec15;

public class SingletonExample {
    public static void main (String[] args) {
        // Singleton obj1 = new Singleton();  // Error
        
        // get Singleton Object by calling static method
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) System.out.println("Same Singleton Object");
        else System.out.println("Different Singleton Object");
    }
}
