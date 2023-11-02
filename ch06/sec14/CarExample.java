package ch06.sec14;

public class CarExample {
    public static void main (String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(-50);  // wrong speed set
        System.out.println("Current Speed : " + myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("Current Speed : " + myCar.getSpeed());

        if (!myCar.isStop()) myCar.setStop(true);
        System.out.println("Current Speed : " + myCar.getSpeed());
    }
}
