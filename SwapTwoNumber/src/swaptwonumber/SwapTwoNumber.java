/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swaptwonumber;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SwapTwoNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int original= num;
        int reverse= 0;
        
        while(num !=0){
        int digit= num%10;
        reverse= reverse*10 + digit;
        num/=10;
        }
        
        System.out.println("Swap number= " + reverse);
    }
    
}
