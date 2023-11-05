package ch09.sec04.exam01;

public class A {
    // constructor
    A() {
        class B { }     // local class
        B b = new B();  // local object
    }

    // method
    void method() {
        class B { }     // local class
        B b = new B();  // local object
    }
}
