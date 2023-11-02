package ch06.sec13.ctor_access_modifier.package2;
// different package with class A
import ch06.sec13.ctor_access_modifier.package1.*;

public class C {
    A a1 = new A(true);        // public access modifier  : ok
    // A a2 = new A(1);          // default access modifier : X
    // A a3 = new A("string")    // private access modifier : X
}
