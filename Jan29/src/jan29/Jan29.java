
package jan29;

import java.util.Locale;
import java.util.Scanner;


public class Jan29 {

    public static void main(String[] args) {
//        System.out.println("\"sabbir\"");
        
        Scanner s = new Scanner(System.in);
        
        String st;
        st = s.nextLine();
        
        
        System.out.println("Output= " + st.substring(0, 1).toUpperCase() 
                + st.substring(1).toLowerCase());
        
        
    }
    
}
