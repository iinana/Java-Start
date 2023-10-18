package ch03.sec04;

public class AccuracyExample {
    public static void main (String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double remain = apple - pieceUnit * number;
        System.out.println("remaining from an apple : " + remain);
    }
}
