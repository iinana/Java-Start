package ch06.sec08.return_statement;

public class CarExample {
    public static void main (String[] args) {
        Car myCar = new Car();

        myCar.setGas(5);
        if (myCar.ifLeftGas()) {
            System.out.println("Start");
            myCar.run();
        }
        System.out.println("Need More Gas");
    }
}
