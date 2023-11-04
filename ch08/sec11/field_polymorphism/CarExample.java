package ch08.sec11.field_polymorphism;

public class CarExample {
    public static void main (String[] args) {
        Car myCar = new Car();

        myCar.run();

        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new HankookTire();

        myCar.run();
    }
}
