package bank.accounts;

import bank.customer.Customer;

public abstract class Account {
    protected int bankAgency;
    protected int numberAgency;
    protected double balance;
    private Customer customer;
    private static int SEQUENTIAL = 1;
    private static final int STANDARD_AGENCY = 1;


    public Account(Customer customer) {
        this.numberAgency = SEQUENTIAL++;
        this.bankAgency = Account.STANDARD_AGENCY;
        this.customer = customer;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void transfer(double amount, Account otherAccount) {
        this.withdraw(amount);
        otherAccount.deposit(amount);
    }

    public int getBankAgency() {
        return bankAgency;
    }

    public int getNumberAgency() {
        return numberAgency;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer () {
        return customer;
    }

    protected void displayInfos() {
        System.out.println(String.format("Account Holder: %s", this.customer.getCustomerName()));
        System.out.println(String.format("Agency: %d", this.bankAgency));
        System.out.println(String.format("Account: %d", this.numberAgency));
        System.out.println(String.format("Balance: %.2f", this.balance));
    }

    public abstract void printCurrentAccount ();
}
