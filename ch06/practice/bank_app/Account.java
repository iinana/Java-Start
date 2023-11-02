package ch06.practice.bank_app;

public class Account {
    String accountNum;
    String name;
    private int balance;

    public Account(String accountNum, String name, int balance) {
        this.accountNum = accountNum;
        this.name = name;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    public boolean setBalance(int balance) {
        if (balance >= 0) { 
            this.balance = balance;
            return true;
        } else return false;
    }
    public boolean changeBalance(int amount) {
        int res = balance + amount;
        if (res < 0) {
            return false;
        } else {
            balance = res;
            return true;
        }
    }
}
