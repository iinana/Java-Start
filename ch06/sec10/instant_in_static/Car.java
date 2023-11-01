package ch06.sec10.instant_in_static;

public class Car {
    int speed;
    void run() {
        System.out.printf("Run (Speed : %d)\n", this.speed);
    }

    static void simulate() {
        Car myCar = new Car();
        myCar.speed = 200;
        myCar.run();
    }

    public static void main(String[] args) {
        simulate();

        Car myCar = new Car();
        myCar.speed = 60;
        myCar.run();
    }
}
