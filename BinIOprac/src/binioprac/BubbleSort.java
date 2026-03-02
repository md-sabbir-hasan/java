
package binioprac;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int [] array = new int[5];
       
       for(int i = 0; i<5; i++){
       array[i] = s.nextInt();
       }
       
        System.out.println(Arrays.toString(array));
        
        
        
        
        for(int i = 0; i<array.length -1; i++){
        for(int j =0; j< array.length-i-1; j++){
        if(array[j]>array[j+1]){
        int temp = array[j+1];
        array[j+1]= array[j];
        array[j] = temp;
        
        }
        
        }
        }
        
        System.out.println(Arrays.toString(array));
       

    }
    
}
