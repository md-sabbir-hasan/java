
package february14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class February14 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Desktop\\jv.txt");
        
        
        try {
            PrintWriter pw = new PrintWriter(file);
            
            pw.println("Test");
            for(int i = 0; i<=100; i++){
            pw.println(i + " BOSS");
            } 
            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(February14.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Scanner s = new Scanner(file);
            
            while(s.hasNext()){
                System.out.println(s.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(February14.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
