package ch04.sec03;
import java.util.Scanner;

public class SwitchCharExample {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strGrade = scanner.nextLine();
        char grade = strGrade.charAt(0);

        switch (grade) {
            case 'A' :
            case 'a' :
                System.out.println("VIP");
                break;
            case 'B' :
            case 'b' :
                System.out.println("Normal");
                break;
            case 'C' :
            case 'c' :
                System.out.println("Guest");
                break;
            default:
                System.out.println("[Error] You can only enter alphabet A to C");
        }
        scanner.close();
    }
}
