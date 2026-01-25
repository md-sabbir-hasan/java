/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jan25prac;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DisplayTime {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Second");
        int seconds = scanner.nextInt();
       int minutes = seconds / 60;
       int second = seconds%60;
       String minMessage;
       if(minutes>1){
       minMessage = " Minutes ";
       }
       else {
           minMessage = " Minute ";
       }
        System.out.println(minutes + minMessage + second + " Seconds");
    }
}
