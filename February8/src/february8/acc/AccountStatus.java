package february8.acc;

public class AccountStatus {

    private int accNo;
    private double balance;
    private int deposit;
    private double withdraw;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double deposit() {
        balance += deposit;
        return balance;
    }

    public double withdraw() {
        if (balance >= withdraw) {
            balance -= withdraw;
        } else {
            System.out.println("Poor , Go and Earn ");
        }
        return balance;
    }
}
