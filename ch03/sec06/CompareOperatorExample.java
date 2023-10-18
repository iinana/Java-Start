package ch03.sec06;

public class CompareOperatorExample {
    public static void main (String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean res1 = (num1 == num2);
        boolean res2 = (num1 != num2);
        boolean res3 = (num1 <= num2);
        System.out.println("num1 == num2 : " + res1);
        System.out.println("num1 != num2 : " + res2);
        System.out.println("num1 <= num2 : " + res3);

        char char1 = 'A';
        char char2 = 'B';
        boolean res4 = (char1 < char2);
        System.out.println("'A' < 'B' : " + res4);

        int num3 = 1;
        double num4 = 1.0;
        boolean res5 = (num3 == num4);
        System.out.println("1 == 1.0 : " + res5);

        float num5 = 0.1f;
        double num6 = 0.1;
        boolean res6 = (num5 == num6);
        boolean res7 = (num5 == (float)num6);
        System.out.println("0.1f == 0.1 : " + res6);
        System.out.println("0.1f == (float)0.1 : " + res7);

        String str1 = "java";
        String str2 = "C++";
        boolean res8 = (str1.equals(str2));
        boolean res9 = (! str1.equals(str2));
        System.out.println("str1 is equal to str2 : " + res8);
        System.out.println("str1 is different to str2 : " + res9);
    }
}
