package ch06.sec13.field_and_method.package2;
// different package with class A
import ch06.sec13.field_and_method.package1.*;

public class C {
    public void method() {
        A a = new A();

        // field value change
        a.field1 = 2;       // public field : ok
        // a.field2 = 2;    // default field : X
        // a.field3 = 2;    // private field : X

        // method call
        a.method1();        // public method : ok
        // a.method2();     // default method : X
        // a.method3();     // private method : X
    }

    public static void main (String[] args) {
        C c = new C();
        c.method();
    }
}
