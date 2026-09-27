package com.mycompany.scd_assignment_1;

public class DigitalWallet {
    private String accountHolder;
    private double balance;
    private String pinCode;

    public DigitalWallet(String accountHolder, double initialBalance, String pinCode) {
        this.accountHolder = accountHolder;
        this.balance = Math.max(initialBalance, 0.0);
        this.pinCode = pinCode;
    }

    public String getAccountHolder() { return accountHolder; }
    public void setAccountHolder(String accountHolder) { this.accountHolder = accountHolder; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean withdraw(double amount, String enteredPin) {
        if (this.pinCode.equals(enteredPin) && amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}
