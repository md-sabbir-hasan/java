package feb3;

import java.util.Arrays;
import java.util.Scanner;

public class Feb3 {
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
        
        int NewArray[] = sort(numbers);
        System.out.println("The sorted Array " + Arrays.toString(NewArray));
        
    }
    public static int[] sort(int[] array){
    for (int i = 0; i< array.length -1; i++) {
        for(int j = 0; j < array.length -1 -i; j++){
            if(array[j] > array[j+1]){
        int temp = array[j];
        array[j]= array[j+1];
        array[j+1] = temp;
            }
        }
    }
    return array;
    }
    
}
