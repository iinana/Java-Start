package ch04.sec03;

public class SwitchExample {
    public static void main (String[] args) {
        int num = (int)(Math.random() * 6) + 1;

        switch (num) {
            case 1:
                System.out.println("Number 1 from a dice");
                break;
            case 2:
                System.out.println("Number 2 from a dice");
                break;
            case 3:
                System.out.println("Numver 3 from a dice");
                break;
            case 4:
                System.out.println("Number 4 from a dice");
                break;
            case 5:
                System.out.println("Number 5 from a dice");
                break;
            case 6:
                System.out.println("Number 6 from a dice");
                break;
            default:
                System.out.println("Error");
        }
    }
}
