/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class EVD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1 exception handeling
//        try {
//            int result= 10/0;
//        } catch (Exception e) {
//            System.out.println(e);
//        }


        //2 io
//        File file= new File("hello.dat");
//
//
//        try {
//            FileOutputStream output= new FileOutputStream(file);
//            for(int i = 1; i<= 10; i++){
//            output.write(i);
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(EVD.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(EVD.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        try {
//            FileInputStream input = new FileInputStream(file);
//            int value;
//            while((value = input.read())!= -1){
//                System.out.println(value + " ");
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(EVD.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(EVD.class.getName()).log(Level.SEVERE, null, ex);
//        }



//3
//List<Integer> num= new ArrayList<>();
//num.add(10);
//num.add(20);
//
//        System.out.println(num);






////4 multithreading
// public static void main(String[] args) {
//        Runnable printA = new PrintChar('A', 20);
//        Runnable printB = new PrintChar('B', 20);
//        Runnable printC = new PrintChar('C', 20);
//        
//        Thread t1 = new Thread(printA);
//        Thread t2 = new Thread(printB);
//        Thread t3 = new Thread(printC);
//        
//        
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//public class PrintChar implements Runnable{
//    private char charToPrint;
//    private int times;
//
//    public PrintChar() {
//    }
//
//    public PrintChar(char charToPrint, int times) {
//        this.charToPrint = charToPrint;
//        this.times = times;
//    }
//    
//
//    @Override
//    public void run() {
//        for(int i = 0; i<times; i++){
//            System.out.print(charToPrint + " ");
//        }
//    }
//    
//}


//5
//int[][] array = {{1, 99, 91, 11, 44}, {0, 10, 9, 9, 11}, {3, 23, 21, 5, 20}, {13, 4, 45, 66, 33}, {11, 0, 1, 20, 56}};
//        System.out.println(Arrays.deepToString(array));
//        for (int[] item : array) {
//            for (int i = 0; i < item.length - 1; i++) {
//                for (int j = 0; j < item.length - 1 - i; j++) {
//                    if (item[j] > item[j + 1]) {
//                        int temp = item[j];
//                        item[j] = item[j + 1];
//                        item[j + 1] = temp;
//                    }
//                }
//            }
//        }
//        System.out.println(Arrays.deepToString(array));



//6 Fibonaccy

// Scanner s = new Scanner(System.in);
//        System.out.println("Enter Number.");
//        long input = s.nextLong();
//        System.out.println("-------------------------------");
//        System.out.println("Fibonacci Numbers are : ");
//        int num1 = 0;
//        int num2 = 1;
//        int sum = 0;
//        int totalSum = num2;
//        System.out.println(num1 + "");
//        System.out.println(num2 + "");
//        for (int i = 3; i <= input; i++) {
//            sum = num1 + num2;
//            System.out.println(sum + " ");
//            totalSum += sum;
//            num1 = num2;
//            num2 = sum;
//
//        }


//7 recursion
//public int getFactorial(int n){
//    if(n==0){
//   return 1;
//    }
//return n* getFactorial(n-1);
//}
//Recursion rec = new Recursion();
//        System.out.println(rec.getFactorial(5));


//8 generics
//public interface GenericArea<E> {
//    public double getArea(E e);
//}
//public class Circle implements GenericArea<Double>{
//
//    @Override
//    public double getArea(Double e) {
//        return Math.PI*e*e;
//    }
//    
//}
// Circle c = new Circle();
//        System.out.println(c.getArea((double) 12));

    }
    
}
