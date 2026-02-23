
package idbexamprac;

import java.util.Scanner;

public class SumofIntuntilNeg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
       int input = s.nextInt();
       
        int sum = 0;
        
        while(input>=0){
        sum = sum+input;
        input= s.nextInt();
        
        }
        System.out.println(sum);
    }
}
