
package feb1;

import java.util.Scanner;

public class Feb1 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int res= CheackFactorial(input);
        System.out.println(res);
        
        
        
        int nu1 = s.nextInt();
        int nu2 = s.nextInt();
//        var res = test.larger(nu1, nu2);
        System.out.println(res);
                
//int s = sum();
//        System.out.println(s);
        
    }
    
//    public static int sum(){
//    int n1= 30;
//    int n2= 30;
//    
//    int sum = n1 + n2;
//    
//    return sum;
//    }
    public static int CheackFactorial(int num) {
        int count=1;
     for(int i= 1; i<=num; i++){
     count = count*i;
     
     }
//     int i = 1;
//     while(i<=num){
//           i++;
//     count =count *i;
//   
//     }
    
             
    return count;
    }
}
