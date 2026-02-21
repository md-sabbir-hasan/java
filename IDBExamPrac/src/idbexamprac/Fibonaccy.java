
package idbexamprac;

import java.util.Scanner;

public class Fibonaccy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int input = s.nextInt();
        int num1= 0;
        int num2 = 1;
        int sum = 0;
        int totalSum = num1+num2;
        
        System.out.println(num1);
        System.out.println(num2);
        
        for (int i = 3; i<=input; i++){
        sum= num1+num2;
            System.out.println(sum);
            totalSum +=sum;
            num1=num2;
            num2=sum;
        }
    }
}
