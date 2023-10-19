package ch04.sec05;
import java.util.Scanner;

public class MyKeyControlExample {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int speed = 0;
        String key = " ";

        do {
            key = scn.nextLine();
            if (key.equals("1")) speed += 50;
            else if (key.equals("2")) {
                if (speed < 50) {
                    System.out.println("[Error] you cannot slow down more");
                    continue;
                } else speed -= 50;
            } else continue;
            System.out.println("[Current Speed] " + speed);
        } while (!key.equals("3"));
        scn.close();
    }
}
