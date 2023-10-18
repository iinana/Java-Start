package ch03.sec04;

public class AccuracyExample2 {
    public static void main (String[] args) {
        int apple = 1;
        int totalPieces = apple * 10;
        int number = 7;

        int res = totalPieces - number;
        System.out.println("Remaining from 10 pieces of apple : " + res);
        System.out.println("Remaining from an apple : " + res/10.0);
    }
}
