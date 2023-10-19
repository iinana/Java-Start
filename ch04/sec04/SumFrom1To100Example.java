package ch04.sec04;
import java.util.Scanner;

public class SumFrom1To100Example {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("enter an integer to start the summation : ");
        String strFrom = scn.nextLine();
        int from = Integer.parseInt(strFrom);

        System.out.print("enter an integer to end the summation : ");
        String strTo = scn.nextLine();
        int to = Integer.parseInt(strTo);

        int sum = 0;
        for (int i = from; i <= to; i++) sum += i;

        System.out.printf("Sum from %d to %d : %d\n", from, to, sum);
        scn.close();
    }
}
