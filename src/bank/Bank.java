package bank;

import bank.accounts.Account;

import java.util.List;

public class Bank {
    private String applicationName;
    private List<Account> accounts;

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public List<Account> getAccounts () {
        return accounts;
    }

    public void setAccounts (List<Account> accounts) {
        this.accounts = accounts;
    }

    public Account findAccountByCustomerName(String customerName) {
        for (Account account : accounts) {
            if (account.getCustomer().getCustomerName().equalsIgnoreCase(customerName)) {
                return account;
            }
        }
        return null;
    }
}
