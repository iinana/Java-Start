package ch09.sec04.exam03;

public class AExample {
    public static void main (String[] args) {
        A a = new A();
        System.out.println("A (with local class B)");
        a.method1(10);

        System.out.println();

        C c = new C();
        System.out.println("C (without local class)");
        c.method1(10);
    }
}
