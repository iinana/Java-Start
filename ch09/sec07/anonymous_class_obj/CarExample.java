package ch09.sec07.anonymous_class_obj;

public class CarExample {
    public static void main (String[] args) {
        Car car = new Car();
        car.run1();
        car.run2();

        car.run3(new Tire() {
            @Override
            public void roll() {
                System.out.println("Anonymous Tire Obj 3 Rolling");
            }
        });
    }
}
