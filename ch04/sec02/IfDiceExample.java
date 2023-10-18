package ch04.sec02;

public class IfDiceExample {
    public static void main (String[] args) {
        int dice = (int) (Math.random() * 6) + 1;
        
        if (dice == 6) System.out.println("Bigges Number");
        else if (dice == 1) System.out.println("Smallest Number");
        else System.out.println(dice); 
    }
}
