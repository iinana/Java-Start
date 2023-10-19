package ch04.sec05;

public class SumFrom1To100Example {
    public static void main (String[] args) {
        int sum = 0;
        int i = 0;

        while (i < 100) {
            i++;
            sum += i;
        }

        System.out.printf("sum from 1 to %d = %d", i, sum);
    }
}
