/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreading;

/**
 *
 * @author Admin
 */
public class MultiThreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Runnable a=new PrintChar('A', 100);
        Runnable b=new PrintChar('B', 100);
        Runnable c=new NewClass(100);
        
        
        Thread a1=new Thread(a);
        Thread b1=new Thread(b);
        Thread c1=new Thread(c);
        
        c1.start();
        a1.start();
        
        b1.start();
    }
    
}
