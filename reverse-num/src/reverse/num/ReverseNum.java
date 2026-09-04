
package reverse.num;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ReverseNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int original=num;
        int rev= 0;
        
        for(int i=0; i<=num;i++){
        int digit= num%10;
        rev= rev*10+digit;
        num/=10;
        
        }
        
        System.out.println(rev);
    }
    
}
