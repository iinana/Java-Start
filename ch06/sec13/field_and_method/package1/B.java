package ch06.sec13.field_and_method.package1;
// same package with class A

public class B {
    public void method() {
        A a = new A();

        // field value change
        a.field1 = 2;     // public field  : ok
        a.field2 = 2;     // default field : ok
        // a.field3 = 2;  // private field : X

        // method call
        a.method1();      // public method : ok
        a.method2();      // default method : ok
        // a.method3();   // private method : X
    }

    public static void main(String[] args) {
        B b = new B();
        b.method();
    }
}
