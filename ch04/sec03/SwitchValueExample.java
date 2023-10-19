package ch04.sec03;
import java.util.Scanner;

public class SwitchValueExample {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        String grade = scn.nextLine();

        int score1 = 0;
        switch (grade) {
            case "A":
                score1 = 100;
                break;
            case "B":
                score1 = 100 - 20;
                break;
            default:
                score1 = 60;
        }
        System.out.println("Score1 : " + score1);

        int score2 = switch(grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };
        System.out.println("Score2 : " + score2);

        scn.close();
    }
}
