package ch02.sec05;

public class BooleanExample {
    public static void main(String[] args) {
        int x = 10;
        boolean result = (x == 10);
        System.out.println("x == 10 : " + result);
        result = ((x < 0) || (x > 200));
        System.out.println("(x < 0) || (x > 200) : " + result);

        boolean stop = true;
        if (stop) {
            System.out.println("stop");
        } else {
            System.out.println("start");
        }
    }
}
