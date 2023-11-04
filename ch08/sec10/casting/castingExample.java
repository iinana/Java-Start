package ch08.sec10.casting;

public class castingExample {
    public static void main (String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();              // can use method in Interface
        // vehicle.checkFare();     // cannot use method in Class

        // casting
        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
