package ch06.sec13.field_and_method.package1;

public class A {
    public int field1;  // public field
    int field2;         // default field
    private int field3; // private field

    public A() {
        field1 = 1;
        field2 = 1;
        field3 = 1;

        method1();
        method2();
        method3();
    }

    // public method
    public void method1() {
        System.out.println(field1);
    }
    
    // default method
    void method2() {
        System.out.println(field2);
    }

    // private method
    private void method3() {
        System.out.println(field3);
    }
}
