package ch09.sec03.exam02;

public class A {
    static class B {
        int field1 = 1;
        static int field2 = 2;

        B() {
            System.out.println("B constructor run");
        }

        void method1() {
            System.out.println("B-method1(instant) run");
        }
        static void method2() {
            System.out.println("B-method2(static) run");
        }
    }
}
