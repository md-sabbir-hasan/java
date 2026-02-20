
package idbexamprac;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give your Number");
        
        int number= s.nextInt();
        
       int count = 0;
       for (int i = 1; i<= number; i++){
       if(number%i==0){
       count = count+1;
       }
       }
       
       if(count==2){
           System.out.println("Prime");
       }else
            System.out.println("not Prime");
    }
}
