package ch07.sec07.compulsory_type_change;

public class CastingExample {
    public static void main (String[] args) {
        Parent parent = new Child();  // promotion

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        /* Error
         * parent.field2 = "data2";
         * parent.method3();
         */

        Child child = (Child)parent;  // casting
        child.field2 = "data2";
        child.method3();
    }
}
