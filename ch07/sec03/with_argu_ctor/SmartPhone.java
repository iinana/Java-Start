package ch07.sec03.with_argu_ctor;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color) {
        super(model, color);  // cannot drop
        System.out.println("SmartPhone(String model, String color) Run");
    }
}
