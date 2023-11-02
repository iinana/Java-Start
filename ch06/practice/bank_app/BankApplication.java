package ch06.practice.bank_app;

public class BankApplication {
    private static Account[] accountList = new Account[100];
    private static int len = 0;

    public static void addAccount(String accountNum, String name, int balance) {
        Account account = new Account(accountNum, name, balance);
        accountList[len] = account;
        len++;
    }

    public static void printList() {
        for (int i = 0; i < len; i++) {
            System.out.printf("%10s  %10s  %10d\n", 
                accountList[i].accountNum, accountList[i].name, accountList[i].getBalance());
        }
    }

    public static boolean deposit(String accountNum, int amount) {
        int idx;
        for (idx = 0; idx < len; idx++) {
            if (accountNum.equals(accountList[idx].accountNum)) break;
        }
        if (idx == len) return false;

        accountList[idx].changeBalance(amount);
        return true;
    }

    public static boolean withdrawal(String accountNum, int amount) {
        int idx;
        for (idx = 0; idx < len; idx++) {
            if (accountNum.equals(accountList[idx].accountNum)) break;
        }
        if (idx == len) return false;

        if (accountList[idx].changeBalance(-amount)) return true;
        else return false;
    }
}
