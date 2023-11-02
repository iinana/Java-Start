package ch07.sec04.method_overriding;

public class Calculator {
    public double areaCircle(double r) {
        System.out.println("Calculator Object - areaCircle() Run");
        return 3.141592 * r * r;
    }
}