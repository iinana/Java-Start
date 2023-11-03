package ch07.sec06.package2;
// different package with class A
import ch07.sec06.package1.*;

// extend A
public class D extends A {
    public D() {
        super();    // call class A protected constructor : ok
    }

    public void method1() {
        this.field = "value";   // protected field : ok
        this.method();          // protected method : ok
    }

    /* cannot do it with New Object */
    // public void method2() {
    //     A a = new A();
    //     a.field = "value";
    //     a.method();
    // }
}
