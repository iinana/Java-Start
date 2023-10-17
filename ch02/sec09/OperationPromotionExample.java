package ch02.sec09;

public class OperationPromotionExample {
    public static void main (String[] args) {
        byte result1 = 10 + 20;
        System.out.println("result1 : " + result1);

        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2;  // operation of byte type vars result = int type
        System.out.println("result2 : " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5;
        System.out.println("result3 : " + result3);

        char v6 = 'A';
        int v7 = 1;
        int result4 = v6 + v7;
        System.out.println("result4 : " + result4);
        System.out.println("result4 : " + (char)result4);

        int v8 = 10;
        int result5 = v8 / 4;
        System.out.println("result5 : " + result5);

        double result6 = v8 / 4.0;
        System.out.println("result6 : " + result6);

        int v9 = 1;
        int v10 = 2;
        double result7 = (double) v9 / v10;
        System.out.println("result7 : " + result7);

    }
}