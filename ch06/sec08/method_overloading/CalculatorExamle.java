package ch06.sec08.method_overloading;

public class CalculatorExamle {
    public static void main (String[] args) {
        Calculator myCalc = new Calculator();

        int square = myCalc.areaRectangle(10);
        System.out.println("squre area : " + square);

        int rectangle = myCalc.areaRectangle(10, 20);
        System.out.println("rectangle area : " + rectangle);
    }
}
