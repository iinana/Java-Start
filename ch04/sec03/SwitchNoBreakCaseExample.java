package ch04.sec03;

public class SwitchNoBreakCaseExample {
    public static void main (String[] args) {
        int time = (int)(Math.random() * 4) + 8;
        System.out.printf("[Current Time : %dh]\n", time);

        switch (time) {
            case 8:
                System.out.println("go to uni");
            case 9:
                System.out.println("have a meeting");
            case 10:
                System.out.println("do my work");
            case 11:
                System.out.println("have some coffee");
            default:
                System.out.println("get back to home");
        }
    }
}