package february10.bank;


public class Account {
    public int accountNumber;
    public String accountHolderName;
    public int balance;
    public int deposit;
    

    public Account() {
    }

    public Account(int accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public Account(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        
    }

    public Account(int deposit) {
        this.deposit = deposit;
    }
    public double deposit(){
        
        balance = balance+ deposit;
    return balance;
    }
    public double displayAccountInfo(){
    return balance;
    }
}
