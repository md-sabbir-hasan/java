/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perfectnumber;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PerfectNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int num= sc.nextInt();
        int sum= 0;
        for (int i = 1; i < num; i++) {
            if(num %i==0){
            sum +=i;
            }
        }
        
        if(sum==num){
            System.out.println("Perfect");
        }
        else{System.out.println("not");}
        
    }
    
}
