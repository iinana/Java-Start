package ch04.practice;

public class MathSlover {
    public static void main (String[] args) {
        int target = 60;

        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                int res = target - 4 * x - 5 * y;
                if (res == 0) System.out.printf("( %2d , %2d )\n", x, y);
            }
        }
    }
}
