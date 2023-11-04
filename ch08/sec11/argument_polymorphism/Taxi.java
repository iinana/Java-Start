package ch08.sec11.argument_polymorphism;

public class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("Taxi is Running");
    }
}
