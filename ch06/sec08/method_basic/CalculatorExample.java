package ch06.sec08.method_basic;

public class CalculatorExample {
    public static void main (String[] args) {
        Calculator myCalc = new Calculator();

        myCalc.powerOn();
        int res1 = myCalc.plus(5, 6);
        System.out.println("result1 : " + res1);
        double res2 = myCalc.divide(10, 4);
        System.out.println("result2 : " + res2);
        myCalc.powerOff();
    }
}
