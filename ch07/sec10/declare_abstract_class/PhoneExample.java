package ch07.sec10.declare_abstract_class;

public class PhoneExample {
    public static void main (String[] args) {
        //Phone phone = new Phone();  // abstract class : X (only can be used by extends)

        SmartPhone smartPhone = new SmartPhone("Hong");
        smartPhone.turnOn();
        smartPhone.turnOff();
    }
}
