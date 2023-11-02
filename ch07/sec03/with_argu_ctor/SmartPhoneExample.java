package ch07.sec03.with_argu_ctor;

public class SmartPhoneExample {
    public static void main (String[] args) {
        SmartPhone myPhone = new SmartPhone("Galaxy", "Silver");
        System.out.println("Model: " + myPhone.model);
        System.out.println("Color: " + myPhone.color);
    }
}
