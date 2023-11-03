package ch07.sec08.argument_polymorphism;

public class Taxi extends Vehicle {
    @Override
    public void run() {
        System.out.println("Taxi Running");
    }
}
