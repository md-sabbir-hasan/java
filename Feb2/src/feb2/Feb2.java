/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package feb2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Feb2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many number do you want to compare");
        int n = s.nextInt();
        
        int numbers [] = new int[n];
        
        System.out.println("Star of loop " + Arrays.toString(numbers));
        
        
        for(int index = 0; index<n; index++){
            System.out.println("Enter your " +(index +1)+ " number");
          //  int userInput = s.nextInt();
            
            numbers[index] = s.nextInt();
        }
        System.out.println("Ending of Loop "+ Arrays.toString(numbers));
        findMaxNumber(numbers);
        findMinNumber(numbers);
        findAverage(numbers);
        
//        int largest =  0;
//        
//        
//        for(int i = 0; i< n; i++){
//      if(numbers[i] >= numbers[i+1]){
//      numbers[i+1] = numbers[i];
//      largest = numbers[i+1];
//      }
//        }
        
        
    }
    public static void findMaxNumber(int[] numbers) {
        int max = 0;
        for (int item : numbers){
        if (item >= max){
        max=item;
        }
        }
        System.out.println("max Number is " + max);
    }
    public static void findMinNumber(int[] numbers) {
        int min =numbers[0];
        for (int item : numbers){
        if (item <= min){
        min=item;
        }
        }
        System.out.println("min Number is " + min);
    }
    
    public static void findAverage(int[] numbers){
    int count = 0;
    
 
      for (int item : numbers){
      count= count+item;
        }
      float avg = count/numbers.length;
        System.out.println(avg );
        }
        
    }

