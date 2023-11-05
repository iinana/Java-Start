package ch09.sec04.exam03;

public class A {
    /* if we use local variable in local class, we cannot change it
       => final characteristic */
    public void method1(int arg) {  // final int arg
        int var = 1;    // final int var
        
        class B {
            void method2() {
                /* only can read local variable */
                System.out.println("arg = " + arg);
                System.out.println("var = " + var);

                /* cannot change local variable */
                // arg = 2;  // X
                // var = 2;  // X
            }
        }

        B b = new B();
        b.method2();

        /* cannot change local variable */
        // arg = 2;  // X
        // var = 2;  // X
    }
}
