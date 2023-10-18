package ch03.practice;
import java.util.Scanner;

public class ExRoundDown {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter integer X (more than three decimal) : ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        int roundedX = x / 100;
        roundedX *= 100;
        System.out.printf("%d after rounding down : %d\n", x, roundedX);

        scanner.close();
    }
}
