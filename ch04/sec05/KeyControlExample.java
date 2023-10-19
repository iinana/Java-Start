package ch04.sec05;
import java.util.Scanner;

public class KeyControlExample {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while (run) {
            System.out.println("--------------------------------------");
            System.out.println("1. Speed up | 2. Speed down | 3. Exit");
            System.out.println("--------------------------------------");
            System.out.print("Choice : ");
            String key = scn.nextLine();

            if (key.equals("1")) {
                speed++;
                System.out.println("Current Speed : " + speed);
            }
            else if (key.equals("2")) {
                if (speed <= 0) System.out.println("[Error] Speed is 0 now");
                else {
                    speed--;
                    System.out.println("Current Speed : " + speed);
                }
            } else if (key.equals("3")) {
                System.out.println(">>> Exit Program <<<");
                run = false;
            }
            else System.out.println("[Error] You should choose among 1-3");
        }
        scn.close();
    }
}
