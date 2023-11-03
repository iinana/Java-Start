package ch07.sec05.final_method;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }

    /* cannot override because of 'final' */
    // @Override
    // public void stop() {
    //     System.out.pritnln("Stop the Sports Car");
    //     speed = 0;
    // }
}
