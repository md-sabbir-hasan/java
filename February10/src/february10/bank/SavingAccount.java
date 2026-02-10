
package february10.bank;

public class SavingAccount extends Account{
    public double interestRate, year;

    public SavingAccount() {
    }

    public SavingAccount(double interestRate, double year) {
        this.interestRate = interestRate;
        this.year = year;
    }

    public SavingAccount(double interestRate, double year, int accountNumber, String accountHolderName, int balance) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
        this.year = year;
    }

    public SavingAccount(double interestRate, double year, int accountNumber, int balance) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
        this.year = year;
    }

    public SavingAccount(double interestRate, double year, int deposit) {
        super(deposit);
        this.interestRate = interestRate;
        this.year = year;
    }

  
    public double addInterest(){
    return super.balance= (int) (super.balance+ (super.balance*interestRate*year));
    }
}
