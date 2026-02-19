/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb19practice;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PossIntsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
      int  sum = 0;
        
        while(input >=0){
            sum= sum + input;
        input = sc.nextInt();
        
        }
        
        System.out.println(sum);
    }
}
