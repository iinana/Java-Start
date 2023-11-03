package ch07.sec06.package1;
// same package with class A

public class B {
    public void method() {
        A a = new A();      // protected constructor : ok
        a.field = "value";  // protected field : ok
        a.method();         // protected method : ok
    }
}
