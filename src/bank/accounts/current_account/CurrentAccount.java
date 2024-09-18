package bank.accounts.current_account;

import bank.accounts.Account;
import bank.customer.Customer;

public class CurrentAccount extends Account {
    public CurrentAccount (Customer customer) {
        super (customer);
    }

    @Override
    public void printCurrentAccount() {
        System.out.println("=== Current Account Statement ===");
        super.displayInfos();
    }
}