package ch04.practice;
import java.util.Scanner;

public class SumOfMultiple {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        String strNum = scn.nextLine();
        int num = Integer.parseInt(strNum);

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % num == 0) sum += i;
        }
        System.out.printf("Summation of %d Multiple (1 to 100) = %d\n", num, sum);

        scn.close();
    }
}
