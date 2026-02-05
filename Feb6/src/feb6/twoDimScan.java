/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class twoDimScan {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        System.out.println("How many Row u want");
      int rows = s.nextInt();
      System.out.println("How many col u want");
      int cols = s.nextInt();
        int numbers[][] = new int[rows][cols];
        
          
           for (int row=0; row<numbers.length; row++){
        for(int col=0; col<numbers[row].length; col++){
            System.out.println("Enter Value For "+ (row+1) + "th row of " + (col+1)+ "th col");
           numbers[row][col]=s.nextInt();
        }
        }
             for(int[] item:numbers){
//            System.out.println(Arrays.toString(item));
        for(int single:item){
            
            System.out.print(single+"\t");
            
//           sum+=single;
            
            
          
        }
            System.out.println("\n");
//            System.out.println(sum);
        }
    }
    
}
