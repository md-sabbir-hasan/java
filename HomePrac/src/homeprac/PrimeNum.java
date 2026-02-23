
package homeprac;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
      int  number= s.nextInt();
        int count= 0;
        
        for(int i=1; i<=number; i++){
        if(number%i==0){
        count= count+1;
        }
        }
        
        if(count==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not");
        }
        
    }
}
