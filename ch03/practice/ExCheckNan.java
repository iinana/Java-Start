package ch03.practice;

public class ExCheckNan {
    public static void main (String[] args) {
        double x = 5.0;
        double y = 4.0;
        double z = x % y;

        if (Double.isInfinite(z) || Double.isNaN(z)) System.out.println("Calculation Error");
        else System.out.printf("x %% y = %f\n", z);
    }
}
