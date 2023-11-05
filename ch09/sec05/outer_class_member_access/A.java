package ch09.sec05.outer_class_member_access;

public class A {
    int field1;
    void method1() { }

    static int field2;
    static void method2() { }

    /* Instant Member Class - can access to any field and method from outer class */
    class B {
        void method() {
            // can use class A's instant field & method
            field1 = 10;
            method1();

            // can use class A's static field & method
            field2 = 10;
            method2();
        }
    }

    /* Static Member Class - can access to only static field and method from outer class */
    static class C {
        void method() {
            // cannot use class A's instant field & method
            // field1 = 10;
            // method1();

            // can use class A's static field & method
            field2 = 10;
            method2();
        }
    }
}
