package ch07.sec03.with_basic_ctor;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color) {
        super(); // able to drop

        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, Stirng color) Constructor Run");
    }
}
