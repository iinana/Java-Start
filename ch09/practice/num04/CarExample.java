package ch09.practice.num04;

import myCar.Tire;

public class CarExample {
    public static void main (String[] args) {
        Car myCar = new Car();

        Tire tire = new myCar.Tire();
        Car.Engine engine = new Car.Engine();
    }
}
