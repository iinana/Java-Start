package ch05.sec06;

public class ArrayLengthExample {
    public static void main (String[] args) {
        int[] scores = { 84, 90, 96 };
        int sum = 0;

        for (int i = 0; i < scores.length; i++) sum += scores[i];
        System.out.println("Total Sum : " + sum);
        System.out.println("Average : " + ((double) sum / scores.length));
    }
}
