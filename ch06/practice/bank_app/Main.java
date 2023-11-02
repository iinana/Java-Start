package ch06.practice.bank_app;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        String req;

        Outer: while (true) {
            System.out.println("------------------------------------------------------------------------");
            System.out.println("1.Make Account | 2.List of Account | 3.Deposit | 4.Withdrawal | 5.Exit");
            System.out.println("------------------------------------------------------------------------");
            System.out.print("Requset > ");
            req = scn.nextLine();

            String accountNum, name, strAmount;
            int amount;
            switch (req) {
                case "1":
                    System.out.println("-------------------");
                    System.out.println("Make a New Account");
                    System.out.println("-------------------");

                    System.out.print("Account Number: ");
                    accountNum = scn.nextLine();

                    System.out.print("Name: ");
                    name = scn.nextLine();

                    System.out.print("Initial Deposit: ");
                    strAmount = scn.nextLine();
                    amount = Integer.parseInt(strAmount);

                    BankApplication.addAccount(accountNum, name, amount);
                    System.out.println("Complete to Make a New Account");
                    break;
                case "2":
                    System.out.println("-------------------");
                    System.out.println("Account List");
                    System.out.println("-------------------");
                    BankApplication.printList();
                    break;
                case "3":
                    System.out.println("-------------------");
                    System.out.println("Deposit");
                    System.out.println("-------------------");

                    System.out.print("Account Number: ");
                    accountNum = scn.nextLine();

                    System.out.print("Deposit Amount: ");
                    strAmount = scn.nextLine();
                    amount = Integer.parseInt(strAmount);
                    if (BankApplication.deposit(accountNum, amount)) System.out.println("Deposit Complete");
                    else System.out.println("Deposit Failed");
                    break;
                case "4":
                    System.out.println("-------------------");
                    System.out.println("Withdrawal");
                    System.out.println("-------------------");

                    System.out.print("Account Number: ");
                    accountNum = scn.nextLine();

                    System.out.print("Withdrawal Amount: ");
                    strAmount = scn.nextLine();
                    amount = Integer.parseInt(strAmount);
                    if (BankApplication.withdrawal(accountNum, amount)) System.out.println("Withdrawal Complete");
                    else System.out.println("Withdrawal Failed");
                    break;
                case "5":
                    System.out.println("Exit Program");
                    break Outer;
                default :
                    System.out.println("Request Error");
            }
        }
        scn.close();
    }
}
