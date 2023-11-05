package ch09.sec04.exam02;

public class A {
    void useB() {
        class B {   // local class
            int field1 = 1;
            static int field2 = 2;

            B() {
                System.out.println("construct class B");
            }

            void method1() {
                System.out.println("B-method1 (instant)");
            }
            static void method2() {
                System.out.println("B-method2 (static)");
            }
        }

        B b = new B();  // local object

        System.out.println("b.field1: " + b.field1);
        b.method1();

        System.out.println("B.field2: " + B.field2);
        B.method2();
    }
}
