/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Day1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int[] num= {10, 25, 7,40,15 };
//        
//        int largest= num[0];
//        int lowest= num[0];
//        
//        for(int i=0; i<=num.length-1; i++){
//        if(num[i]>largest){
//        largest= num[i];
//        
//        }
//        if(num[i]<lowest){
//        lowest = num[i];
//        }
//        }
//        System.out.println("Largest= " + largest);
//        System.out.println("Lowest= "+ lowest);
//        
//        


        Scanner sc= new Scanner(System.in);
        String word= sc.next();
        
        String rev= "";
        
        for (int i = word.length()-1; i >= 0; i--) {
            rev= rev + word.charAt(i);
        }
        
        if(word.equals(rev)){
            System.out.println("pLAINDROM");
        }
        else{
            System.out.println("Not");
        }

    }
    
}
