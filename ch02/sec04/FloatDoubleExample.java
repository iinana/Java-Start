package ch02.sec04;

public class FloatDoubleExample {
    public static void main (String[] args) {
        double var1 = 0.25;
        double var2 = -3.14;

        double var3 = 5e2;      // 5.0 * 10^2 = 500.0
        double var4 = 0.12E-2;  // 0.12 * 10^-2 = 0.0012

        float var5 = 3.14f;
        float var6 = 3E6F;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);

        // check the precision
        float var7 = 0.1234567890123456789f;
        double var8 = 0.1234567890123456789;
        System.out.println("float type precision : " + var7);
        System.out.println("double type precsion : " + var8);
    }
}
