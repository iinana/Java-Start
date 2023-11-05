package ch09.sec02.exam01;

public class AExample {
    public static void main (String[] args) {
        // B can be declared after A's declaring
        A a = new A();
        A.B b = a.new B();
    }
}
