package ch06.sec08.method_overloading;

public class Calculator {
    int areaRectangle(int r) {
        return r * r;
    }

    int areaRectangle(int r1, int r2) {
        return r1 * r2;
    }
}
