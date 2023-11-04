package ch08.sec11.argument_polymorphism;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("Bus is Running");
    }
}
