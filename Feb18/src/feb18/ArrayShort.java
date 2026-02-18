/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feb18;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ArrayShort {
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
        
//        int NewArray[] = sort(numbers);
//        System.out.println("The sorted Array " + Arrays.toString(NewArray));

int max= numbers[0];
int min = numbers[0];

for(int i = 0; i<n; i++){
if (numbers[i]>max){
max = numbers[i];
}
if (numbers[i]<min){
min = numbers[i];
}
}

        System.out.println(max);
        System.out.println(min);



    }
}
