package ch07.sec10.declare_abstract_class;

public abstract class Phone {
    String owner;
    
    Phone(String owner) {
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("Turn On the Phone");
    }
    void turnOff() {
        System.out.println("Turn Off the Phone");
    }
}
