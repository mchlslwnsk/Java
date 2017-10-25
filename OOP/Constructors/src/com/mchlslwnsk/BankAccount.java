package com.mchlslwnsk;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("00000000", 0d, "Default name", "Default adress", "0000000000");
        System.out.println("Empty constructon");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with parametres");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999999", 200d, customerName, email, phoneNumber);
    }

    public void setDepositFunds(double depositFunds) {
        this.balance += depositFunds;
        System.out.println("Total balance: " + this.balance);
    }

    public void getWithdrawFunds(double withdrawFunds) {
        if (this.balance - withdrawFunds < 0) {
            System.out.println("Sufficient funds on account: " + this.balance);

        } else {
            this.balance -= withdrawFunds;
            System.out.println("Insufficient funds " + this.balance);
        }
    }

    public void displayCustomer() {
        System.out.println("Customer data: " + "\nAccount number: " + getAccountNumber() + "\nCustomer name: " + getCustomerName()
                + "\nEmail: " + getEmail() + "\nPhone: " + getPhoneNumber() + "\nBalance: " + getBalance());
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getEmail() {
        return email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


}


