package ch07.sec08.field_polymorphism;

public class CarExample {
    public static void main (String[] args) {
        Car myCar = new Car();
        
        myCar.tire = new Tire();
        myCar.run();

        // automatic type change (promotion)
        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
