package ch06.sec06.field_declare;

public class CarExample {
    public static void main (String[] args) {
        Car myCar = new Car();

        System.out.println("Model name : " + myCar.model);
        System.out.println("ON/OFF : " + myCar.start);
        System.out.println("Current Speed : " + myCar.speed);
    }
}
