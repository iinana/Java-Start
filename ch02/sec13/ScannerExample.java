package ch02.sec13;
import java.util.Scanner;

public class ScannerExample {
    public static void main (String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter value x : ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("enter value y : ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        System.out.printf("x + y = %d\n", (x+y));
        System.out.println();

        while (true) {
            System.out.print("input String : ");
            String str = scanner.nextLine();
            if (str.equals("q")) break;

            System.out.println("output String : " + str);
            System.out.println();
        }

        System.out.println("Exit");
        scanner.close();
    }
}
