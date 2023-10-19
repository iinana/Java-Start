package ch04.sec03;
import java.util.Scanner;

public class SwitchExpressionExample {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        String strGrade = scn.next();
        char grade = strGrade.charAt(0);

        switch (grade) {
            case 'A', 'a' -> System.out.println("VIP");
            case 'B', 'b' -> System.out.println("General");
            case 'C', 'c' -> System.out.println("Guest");
            default -> System.out.println("[Error] you can only enter a-c");
        }

        scn.close();
    }
}
