
package homeprac;

import java.util.Scanner;

public class SumofInt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      int  inp= s.nextInt();
      
      int sum=0;
      while(inp>0){
      sum=sum+inp;
      inp = s.nextInt();
      }
      
        System.out.println(sum);
    }
}
