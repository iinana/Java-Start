package ch04.sec02;
import java.util.Scanner;

public class IfExample {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the score (out of 100) : ");
        String strScore = scanner.nextLine();
        int score = Integer.parseInt(strScore);

        if (score > 90) {
            System.out.println("Score is larger than 90");
            System.out.println("Grade is 'A'");
        }

        if (score < 90) {
            System.out.println("Score is smaller than 90");
            System.out.println("Grader is 'B'");
        }

        scanner.close();
    }
}
