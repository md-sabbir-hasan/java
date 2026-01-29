/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jan29;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class whileLoop {
    public static void main(String[] args) {
        
        long multi = 1;
        int count;
        Scanner s = new Scanner(System.in);
        int fac = s.nextInt();
//        
//        while(count<=fac){
//        multi = multi*count;
//        count++;
//        }
//        System.out.println(multi);
        
        
        
        for(count=1; count<=fac; count++){
        multi =  multi*count;
        }
        System.out.println(multi);
    }
}
