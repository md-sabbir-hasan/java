
package binioprac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinIOprac {

    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("C:\\Users\\Admin\\Desktop\\temp.txt");
            for(int i = 1; i<=10; i++){
            output.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinIOprac.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinIOprac.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream input = new FileInputStream("C:\\Users\\Admin\\Desktop\\temp.txt");
            int value;
            while((value=input.read()) !=-1){
                System.out.println(value);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BinIOprac.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BinIOprac.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        File file = new File("temp.txt");
        
        String path = file.getAbsolutePath();
        
        System.out.println(path);
        
        
        
        
        
        
   
        
    }
    
}
