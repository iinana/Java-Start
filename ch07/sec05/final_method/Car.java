package ch07.sec05.final_method;

public class Car {
    public int speed;
    
    public void speedUp() {
        speed++;
    }

    public final void stop() {
        System.out.println("Stop the Car");
        speed = 0;
    }
}