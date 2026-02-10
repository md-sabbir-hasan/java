
package february10.bank;

public class CurrentAccount extends  SavingAccount{
    public int withdraw;

    public CurrentAccount() {
    }

    public CurrentAccount(int withdraw) {
        this.withdraw = withdraw;
    }

    public CurrentAccount(int withdraw, double interestRate, double year) {
        super(interestRate, year);
        this.withdraw = withdraw;
    }

    public CurrentAccount(int withdraw, double interestRate, double year, int accountNumber, String accountHolderName, int balance) {
        super(interestRate, year, accountNumber, accountHolderName, balance);
        this.withdraw = withdraw;
    }

    public CurrentAccount(int withdraw, double interestRate, double year, int accountNumber, int balance) {
        super(interestRate, year, accountNumber, balance);
        this.withdraw = withdraw;
    }

    public CurrentAccount(int withdraw, double interestRate, double year, int deposit) {
        super(interestRate, year, deposit);
        this.withdraw = withdraw;
    }

   
    
    
    public double withdraw(){
    if(super.balance>= withdraw){
    super.balance -= withdraw;
    return super.balance;
    }
   return -1;
    }
}
