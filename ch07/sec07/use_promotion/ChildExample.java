package ch07.sec07.use_promotion;

public class ChildExample {
    public static void main (String[] args) {
        Child child = new Child();
        child.method1();
        child.method2();
        child.method3();

        // automatic type change (promotion)
        Parent parent = child;
        parent.method1();
        parent.method2();       // Overrided method run as Override version
        // parent.method3();    // cannot run the method only in child class5
    }
}
