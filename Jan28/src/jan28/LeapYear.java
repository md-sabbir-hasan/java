/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jan28;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LeapYear {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        
        System.out.println("Enter A Year");
        int year = s.nextInt();
       
        
        if(year % 4 == 0 ) {
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap year");
                    
                }
            else{
                    System.out.println("Not Leap year");
            }
            }
            else{
                System.out.println("Leap Year");
            }
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
    
}
