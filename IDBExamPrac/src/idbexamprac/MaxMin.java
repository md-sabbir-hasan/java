package idbexamprac;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numbers[] = new int[5];

        for (int index = 0; index < 5; index++) {
            numbers[index] = s.nextInt();

        }
        System.out.println("Arrays= " + Arrays.toString(numbers));
        
        
        int max= numbers[0];
        int min= numbers[0];
        
        for (int i =0; i<5; i++){
        if(numbers[i]>max){
            max = numbers[i];
        }
        if(numbers[i]<min){
            min = numbers[i];
        }
        
        }
        System.out.println(max);
        System.out.println(min);

    }
}
