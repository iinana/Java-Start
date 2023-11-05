package ch09.sec02.exam01;

public class A {
    class B {}          // instance member class
    
    B field = new B();  // class B field

    A() {
        B b = new B();  // class B constructor
    }

    void method() {     // instance method
        B b = new B();
    }
}
