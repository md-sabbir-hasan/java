
package binaryio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PWio {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\Admin\\Desktop\\jc.txt");
        
        try {
            try (PrintWriter pw = new PrintWriter(f)) {
                pw.println("Test");
                            for(int i = 0; i<=10; i++){
            pw.println(i + " JEE");
            } 
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PWio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Scanner s = new Scanner(f);
           while(s.hasNext()){
               System.out.println(s.nextLine());
           }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PWio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
}
