package ch04.practice;
import java.util.Scanner;

public class SwitchPrac {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Grade : ");
        String grade = scn.nextLine();

        int score = switch(grade) {
            case "A", "a" -> 100;
            case "B", "b" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };
        System.out.println("score = " + score);

        scn.close();
    }
}
