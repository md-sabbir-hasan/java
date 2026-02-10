/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package february10.bank;

/**
 *
 * @author Admin
 */
public class bank {
    public static void main(String[] args) {
        CurrentAccount ca = new CurrentAccount();
        ca.deposit = 500;
        
        System.out.println(ca.deposit);
        
        System.out.println(ca.deposit());
        ca.interestRate = 0.5;
        System.out.println();
        System.out.println(ca.addInterest());
    }
}
