package ch03.sec05;

public class InfinityAndNaNCheckExample {
    public static void main (String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y;
        double p = x % y;

        if (Double.isInfinite(z) || Double.isNaN(z)) System.out.println("Calculation Erorr");
        else System.out.println("z = " + z);

        if (Double.isInfinite(p) || Double.isNaN(p)) System.out.println("Calculation Error");
        else System.out.println("p = " + p);
    }
}
