package ch04.practice;
import java.util.Scanner;

public class BankPrac {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        int balance = 0;
        boolean run = true;

        String choice;
        do {
            System.out.println("--------------------------------------------------");
            System.out.println("1. Deposit | 2. Withdrawal | 3. Balance | 4. Exit");
            System.out.println("--------------------------------------------------");

            System.out.print("Choice > ");
            choice = scn.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Deposit > ");
                    String strDeposit = scn.nextLine();
                    balance += Integer.parseInt(strDeposit);
                    break;
                case "2":
                    System.out.print("Withdrawal > ");
                    String strWithdrawl = scn.nextLine();
                    balance -= Integer.parseInt(strWithdrawl);
                    break; 
                case "3":
                    System.out.println("Balance > " + balance);
                    break;
                case "4":
                    run = false;
                    break;
                default:
                    System.out.println("Enter 1-4");
            }
            System.out.println();
        } while (run);
        System.out.println(">>> Program Exit <<<");
        scn.close();
    }
}
