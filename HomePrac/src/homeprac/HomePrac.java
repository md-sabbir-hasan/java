package homeprac;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
//
//        int array[] = new int[5];
//
//        for (int i = 0; i < 5; i++) {
//            array[i] = s.nextInt();
//        }
//
//        System.out.println(Arrays.toString(array));
//        
//        
//        for(int i= 0; i<array.length-1; i++){
//        for(int j=0; j<array.length-i-1;j++){
//        if(array[j]>array[j+1]){
//        int temp= array[j+1];
//        array[j+1]=array[j];
//        array[j]=temp;
//        }
//        }
//        }       
//System.out.println(Arrays.toString(array));




//Fibnaccy
//int input = s.nextInt();
//        int num1= 0;
//        int num2 = 1;
//        int sum = 0;
//        int totalSum = num1+num2;
//        
//        System.out.println(num1);
//        System.out.println(num2);
//        
//        for (int i = 3; i<=input; i++){
//        sum= num1+num2;
//            System.out.println(sum);
//            totalSum +=sum;
//            num1=num2;
//            num2=sum;
//        }



//PW
//File f = new File("C:\\Users\\Admin\\Desktop\\jc.txt");
//        
//        try {
//            try (PrintWriter pw = new PrintWriter(f)) {
//                pw.println("Test");
//                            for(int i = 0; i<=10; i++){
//            pw.println(i + " JEE");
//            } 
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(PWio.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        try {
//            Scanner s = new Scanner(f);
//           while(s.hasNext()){
//               System.out.println(s.nextLine());
//           }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(PWio.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
