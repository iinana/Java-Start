package ch04.sec02;
import java.util.Scanner;

public class IfElseExample {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the score (out of 100): ");
        String strScore = scanner.nextLine();
        int score = Integer.parseInt(strScore);

        if (score >= 90) {
            System.out.println("Score is higher than 90");
            System.out.println("Grade is A");
        } else {
            System.out.println("Score is lower than 90");
            System.out.println("Grade is B");
        }

        scanner.close();
    }
}
