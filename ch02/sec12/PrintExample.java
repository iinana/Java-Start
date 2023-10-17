package ch02.sec12;

public class PrintExample {
    public static void main (String[] args) {
        // printf : [argument_index$] [flags] [width] [.precision] conversion

        int value = 123;
        System.out.printf("Price : %d won\n", value);
        System.out.printf("Price : %6d won\n", value);
        System.out.printf("Price : %-6d won\n", value);
        System.out.printf("Price : %06d won\n", value);

        float pi = 3.141592f;
        int r = 10;
        System.out.printf("width of circle with radius %1$d : %2$.2f\n", r, r*r*pi);

        String name = "Hong";
        String job = "Doctor";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
    }
}
