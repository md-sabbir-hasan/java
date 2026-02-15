
package atm.model;

import atm.service.AccountUtil;

public abstract class Accounts implements AccountUtil{
    protected String accountNumber;
    protected double balance;

    public Accounts() {
    }

    public Accounts(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    
    
}
