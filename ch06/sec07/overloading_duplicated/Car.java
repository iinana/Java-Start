package ch06.sec07.overloading_duplicated;

public class Car {
    String company = "Hyndai";
    String model;
    String color;
    int maxSpeed;

    Car(String model) {
        this(model, "Silver", 250);
    }

    Car(String model, String color) {
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
