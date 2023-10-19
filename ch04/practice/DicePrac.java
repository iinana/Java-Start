package ch04.practice;

public class DicePrac {
    public static void main(String[] args) {
        int dice1, dice2;
        do {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;

            System.out.printf("( %d , %d )\n", dice1, dice2);
        } while ((dice1 + dice2) != 5);
    }
}
