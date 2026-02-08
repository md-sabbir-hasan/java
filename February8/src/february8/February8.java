
package february8;

import february8.acc.AccountStatus;
import february8.calculation.POS;

public class February8 {

    public static void main(String[] args) {
//        POS p = new POS();
//        System.out.println(p.getFinalPrice(10, 5));
//        System.out.println(p.getFinalPrice(100, 5));
//        System.out.println(p.getFinalPrice(150, 10));
//        System.out.println(p.getFinalPrice(1050, 5));

        AccountStatus acc = new AccountStatus();
        acc.setBalance(1000);
        acc.deposit();
        System.out.println("your Balance is " + acc.getBalance());
        
        acc.setWithdraw(510);
        acc.withdraw();
        System.out.println("Net Balance " + acc.getBalance());
        
        acc.setWithdraw(550);
        acc.withdraw();
        System.out.println(acc.getBalance());
    }
    
}
