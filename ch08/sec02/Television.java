package ch08.sec02;

public class Television implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("Turn on Tv");
    }
}
