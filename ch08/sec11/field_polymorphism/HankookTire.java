package ch08.sec11.field_polymorphism;

public class HankookTire implements Tire {
    @Override
    public void roll() {
        System.out.println("Hankook Tire rolling");
    }
}
