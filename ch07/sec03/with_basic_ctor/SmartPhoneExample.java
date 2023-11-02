package ch07.sec03.with_basic_ctor;

public class SmartPhoneExample {
    public static void main (String[] args) {
        SmartPhone smart = new SmartPhone("Galaxy", "Silver");

        System.out.println("Model: " + smart.model);
        System.out.println("Color: " + smart.color);
    }
}
