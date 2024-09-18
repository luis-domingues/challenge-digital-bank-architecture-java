package bank.accounts.savings_account;

import bank.accounts.Account;
import bank.customer.Customer;

public class SavingsAccount extends Account {
    public SavingsAccount (Customer customer) {
        super (customer);
    }

    @Override
    public void printCurrentAccount() {
        System.out.println("=== Savings Account Statement ===");
        super.displayInfos();
    }
}
