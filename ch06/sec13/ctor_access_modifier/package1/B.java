package ch06.sec13.ctor_access_modifier.package1;
// same package with class A

public class B {
    A a1 = new A(true);         // public access modifier  : ok
    A a2 = new A(1);            // default access modifier : ok
    /// A a3 = new A("string");   // private access modifier : x
}
