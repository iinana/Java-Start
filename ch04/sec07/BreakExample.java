package ch04.sec07;

public class BreakExample {
    public static void main (String[] args) throws Exception {
        while (true) {
            int dice = (int) (Math.random() * 6) + 1;

            if (dice == 6) break;
            else System.out.println("dice : " + dice);
        }
        System.out.println("Program Exit");
    }
    
}
