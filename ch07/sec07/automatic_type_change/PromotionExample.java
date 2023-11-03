package ch07.sec07.automatic_type_change;

/* A -> B -> D
     -> C -> E */

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}


public class PromotionExample {
    public static void main (String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        // type is automatically changed (because there are in inheritance relationship)
        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        // Error (not in inheritance relationship)
        // B b3 = e;
        // C c2 = d;

    }
}
