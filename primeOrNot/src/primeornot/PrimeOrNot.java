
package primeornot;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PrimeOrNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc= new Scanner(System.in);
        
       int num=sc.nextInt();
//        int count=0;
//        
//        for(int i=1;i<=num;i++){
//        if(num%i==0){
//        count++;
//        }
//        }
//        
//        if(count>2){
//            System.out.println("Not prime");
//        }
//        else{
//            System.out.println("prime");
//        }




//Factorial

int value=1;

for(int i=1;i<=num;i++){
value*=i;
}

        System.out.println(value);
    }
    
}
