package ch08.sec10.casting;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("Bus is Running");
    }

    public void checkFare() {
        System.out.println("Checking Bus Fare");
    }
}
