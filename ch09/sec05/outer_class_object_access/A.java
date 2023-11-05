package ch09.sec05.outer_class_object_access;

public class A {
    String field = "A-field";

    void method() {
        System.out.println("A-method");
    }

    class B {
        String field = "B-field";

        void method() {
            System.out.println("B-method");
        }

        void print() {
            /* use field & method in B Object */
            System.out.println(this.field);
            this.method();

            /* use field & method in A Object */
            System.out.println(A.this.field);
            A.this.method();
        }
    }

    void useB() {
        B b = new B();
        b.print();
    }
}
