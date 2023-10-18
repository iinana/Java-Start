package ch03.sec08;

public class BitShiftExample1 {
    public static void main (String[] args) {
        int num1 = 1;
        int res1 = num1 << 3;
        int res2 = num1 * (int)Math.pow(2, 3);
        System.out.printf("%d << 3 : %d\n", num1, res1);
        System.out.printf("%d * (2^3) : %d\n", num1, res2);

        int num2 = -8;
        int res3 = num2 >> 3;
        int res4 = num2 / (int)Math.pow(2, 3);
        System.out.printf("%d >> 3 : %d\n", num2, res3);
        System.out.printf("%d / (2^3) : %d\n", num2, res4);

        int res5 = num2 >>> 3;
        System.out.printf("%d >>> 3 : %d\n", num2, res5);
    }
}
