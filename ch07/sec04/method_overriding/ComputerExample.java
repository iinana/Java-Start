package ch07.sec04.method_overriding;

public class ComputerExample {
    public static void main (String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("Circle Area: " + calculator.areaCircle(r));

        Computer computer = new Computer();
        System.out.println("Circle Area: " + computer.areaCircle(r));
    }
}
