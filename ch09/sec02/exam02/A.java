package ch09.sec02.exam02;

public class A {
    class B {
        int field1 = 1;
        static int field2 = 2;

        B() {
            System.out.println("B consturctor run");
        }

        void method1() {
            System.out.println("B-method1 run");
        }

        static void method2() {
            System.out.println("B-method2 run");
        }
    }

    void useB() {
        B b = new B();
        System.out.println("B field1 (instant) : " + b.field1);
        b.method1();

        System.out.println("B field2 (static) : " + B.field2);
        B.method2();
    }
}
