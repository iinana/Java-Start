package ch04.sec02;
import java.util.Scanner;

public class IfElseIfElseExample {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Score (out of 100) : ");
        String strScore = scanner.nextLine();
        int score = Integer.parseInt(strScore);

        if (score >= 90) {
            System.out.println("score is higher than 90");
            System.out.println("Grade is A");
        } else if (score >= 80) {
            System.out.println("score is in 80~89");
            System.out.println("Grade is B");
        } else if (score >= 70) {
            System.out.println("score is in 70~79");
            System.out.println("Grade is C");
        } else {
            System.out.println("score is lower than 70");
            System.out.println("Grade is F");
        }

        scanner.close();
    }
}
