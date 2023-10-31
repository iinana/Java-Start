package ch06.sec08.method_basic;

public class Calculator {
    void powerOn() {
        System.out.println("Power on");
    }
    void powerOff() {
        System.out.println("Power off");
    }

    int plus(int x, int y) {
        return x + y;
    }
    double divide(int x, int y) {
        return (double) x / (double) y;
    }
}
