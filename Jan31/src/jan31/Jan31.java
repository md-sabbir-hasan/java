
package jan31;

import java.util.Scanner;

public class Jan31 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        int number= s.nextInt();
       int su= 0;
        
        for(int i = 1; i<=number; i++){
        if(number % i==0){
        su = su +1;
            System.out.println(su);
        }
        
       
        
        }
         if(su == 2){
            System.out.println("Prime");
        }
        
        else {
            System.out.println("not prime");
        }
         
        
        
   
    }
    
}
