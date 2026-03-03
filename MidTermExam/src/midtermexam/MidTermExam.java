
package midtermexam;

import java.util.Scanner;

public class MidTermExam {

    public static void main(String[] args) {
//       Prime Number

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        
        int n = s.nextInt();
        int sum= 0;
        
        for(int i= 1; i<=n;i++){
        if(n%i==0){
        sum++;
        }
        }
        
        if(sum==2){
            System.out.println("This Number is Prime");
        }
        else{
            System.out.println("This is not Prime");
        }
    }
    
}
