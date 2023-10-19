package ch04.sec06;
import java.util.Scanner;

public class DoWhileExample {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the message (exit key is 'q')");
        String message;

        do {
            System.out.print("> ");
            message = scn.nextLine();
            System.out.println(message);
        } while (!message.equals("q"));

        scn.close();
    }
}
