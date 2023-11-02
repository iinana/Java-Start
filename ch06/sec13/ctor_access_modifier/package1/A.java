package ch06.sec13.ctor_access_modifier.package1;

public class A {
    // field declaration
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("String");

    // public access modifier
    public A(boolean b) {
    }

    // default access modifier
    A(int b) {
    }

    // private access modifier
    private A(String S) {
    }
}
