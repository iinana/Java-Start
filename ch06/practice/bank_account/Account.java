package ch06.practice.bank_account;

public class Account {
    private int balance;
    private final int MIN_BALANCE = 0;
    private final int MAX_BALANCE = 1000000;

    public void setBalance(int balance) {
        if ((balance <= MAX_BALANCE) && (balance >= MIN_BALANCE)) {
            this.balance = balance;
        }
    }
    public int getBalance() {
        return balance;
    }
}
