package ch06.sec06.field_use;

public class CarExample {
    public static void main (String[] args) {
        Car myCar = new Car();

        System.out.println("Company : " + myCar.company);
        System.out.println("Model : " + myCar.model);
        System.out.println("Color : " + myCar.color);
        System.out.println("Max Speed : " + myCar.maxSpeed);
        System.out.println("Current Speed : " + myCar.speed);

        myCar.speed = 60;
        System.out.println("Changed Speed : " + myCar.speed);
    }
}
