package ch06.sec13.class_access_modifier.package2;
import ch06.sec13.class_access_modifier.package1.*;

public class C {
    // different package with class A and class B
    // class A -> cannot access ('default' modifier)
    // class B -> can access ('public' modifier)

    // A a   // error
    B b;     // ok
}
