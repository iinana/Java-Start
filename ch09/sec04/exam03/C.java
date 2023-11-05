package ch09.sec04.exam03;

public class C {
    public void method1(int arg) {
        int var = 1;
        System.out.println("arg initial: " + arg);
        System.out.println("var initial: " + var);
        
        arg = 2;
        var = 2;
        System.out.println("arg changed: " + arg);
        System.out.println("var changed: " + var);
    }
}
