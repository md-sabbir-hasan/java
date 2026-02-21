package homeprac;

import java.util.Arrays;
import java.util.Scanner;

public class HomePrac {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Number");
//prime
//        int number = s.nextInt();
//        int count = 0;
//        
//        for (int i = 1; i<=number; i++){
//            if (number%i==0) {
//                count+=1;
//            }
//            
//        }
//        
//        if (count==2) {
//            System.out.println("Prime");
//        } else {
//            System.out.println("Not");
//        }


//SumInt
//        int numbers = s.nextInt();
//       int sum = 0;
//       while(numbers>0){
//       sum+=numbers;
//       numbers = s.nextInt();
//       }
//       
//        System.out.println(sum);


//maxMin
//        int array[] = new int[5];
//
//        for (int i = 0; i<5;i++) {
//            
//            array[i]=s.nextInt();
//        }
//        
//        System.out.println(Arrays.toString(array));
//        
//        
//        int max=array[0];
//        int min=array[0];
//        
//        for(int i = 0; i< 5; i++){
//        if(array[i]>max){
//        max= array[i];
//        }
//        }
//        System.out.println(max);



//factorial
//
// int sum = 1;
//        
//        for(int i = 1; i<=6; i++){
//        sum= sum*i;
//        }
//        
//        System.out.println(sum);




//two-dimen
//
//        int [][]matrix = new int[5][5];
//        
//        matrix[0][1] = 5;
//        matrix[0][2] = 6;
//        
//        
//        int [][] matrix2 = {{1,2,3},{4,5,6},{7,8}};
//        
//        
//        
//        System.out.println(Arrays.deepToString(matrix));
//        System.out.println(Arrays.deepToString(matrix2));


//bubblesort

        int array[] = new int[5];

        for (int i = 0; i < 5; i++) {
            array[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(array));
        
        
        for(int i= 0; i<array.length-1; i++){
        for(int j=0; j<array.length-i-1;j++){
        if(array[j]>array[j+1]){
        int temp= array[j+1];
        array[j+1]=array[j];
        array[j]=temp;
        }
        }
        }
        
//                for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - i - 1; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j + 1];
//                    array[j+1] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
System.out.println(Arrays.toString(array));
    }

}
