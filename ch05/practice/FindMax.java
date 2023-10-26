package ch05.practice;

public class FindMax {
    public static void main (String[] args) {
        int[] array = { 1, 5, 3, 8, 2 };

        int max = 0;
        for (int curr : array) {
            if (curr > max) max = curr;
        }

        System.out.println("Max Value : " + max);
    }
}
