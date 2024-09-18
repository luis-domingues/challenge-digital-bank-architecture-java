package main;

import bank.accounts.Account;
import bank.accounts.current_account.CurrentAccount;
import bank.accounts.savings_account.SavingsAccount;
import bank.customer.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customerName = new Customer();
        Customer newCustomerName = new Customer();
        customerName.setCustomerName("Luís Paulo");
        newCustomerName.setCustomerName("John Doe");

        Account currentAccount = new CurrentAccount(customerName);
        Account savingsAccount = new SavingsAccount(newCustomerName);

        currentAccount.deposit(100);
        currentAccount.transfer(75, savingsAccount);

        currentAccount.printCurrentAccount();
        savingsAccount.printCurrentAccount();
    }
}