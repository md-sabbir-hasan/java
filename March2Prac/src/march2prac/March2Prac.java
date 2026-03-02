
package march2prac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class March2Prac {

    public static void main(String[] args) {
        
// 1       Exception Handaler


//        int value1= 10;
//        int value2= 0;
//        try {
//                    double ans = value1/value2;
//        System.out.println(ans);
//        } catch (Exception e) {
//            System.out.println("Invalid");
//        }
        
        
// 2      BinIO

//try {
//            FileOutputStream output = new FileOutputStream("C:\\Users\\Admin\\Desktop\\temp.txt");
//            for(int i = 1; i<=10; i++){
//            output.write(i);
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(BinIOprac.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(BinIOprac.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        try {
//            FileInputStream input = new FileInputStream("C:\\Users\\Admin\\Desktop\\temp.txt");
//            int value;
//            while((value=input.read()) !=-1){
//                System.out.println(value);
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(BinIOprac.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(BinIOprac.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        File file = new File("temp.txt");
//        
//        String path = file.getAbsolutePath();
//        
//        System.out.println(path);
//        


//3 Bubble sort

//        Scanner s = new Scanner(System.in);
//       int [] array = new int[5];
//       
//       for(int i = 0; i<5; i++){
//       array[i] = s.nextInt();
//       }
//       
//        System.out.println(Arrays.toString(array));
//        
//        
//        
//        
//        for(int i = 0; i<array.length -1; i++){
//        for(int j =0; j< array.length-i-1; j++){
//        if(array[j]>array[j+1]){
//        int temp = array[j+1];
//        array[j+1]= array[j];
//        array[j] = temp;
//        
//        }
//        
//        }
//        }
//        
//        System.out.println(Arrays.toString(array));



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


        
    }
    
}
