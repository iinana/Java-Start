package ch06.sec07.overloading;

public class Car {
    String company = "Hyndai";
    String model;
    String color;
    int maxSpeed;

    /* constructor 1 */
    public Car() {}; 

    /* constructor 2 */
    public Car(String m) {
        model = m;
    }

    /* constructor 3 */
    public Car(String m, String c) {
        model = m;
        color = c;
    }

    /* constructor 4 */
    public Car(String m, String c, int max) {
        model = m;
        color = c;
        maxSpeed = max;
    }
}
