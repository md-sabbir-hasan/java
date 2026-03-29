/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author User
 */
public class Multithread implements Runnable{
    private char charToPoint;
    private int times;

    public Multithread() {
    }

    public Multithread(char charToPoint, int times) {
        this.charToPoint = charToPoint;
        this.times = times;
    }
    

    @Override
    public void run() {
        for(int i=0;i<=times; i++){
            System.out.println(charToPoint+ " ");
        }
    }
    
}
