
package com.mycompany.computearea;

import java.util.Scanner;


public class NewClass {
    
    public static void main(String[] args) {
        
        float radius;
        Scanner input = new Scanner(System.in);
        double area;
        System.out.println("Enter Radius here");
        radius = input.nextFloat();

        System.out.println("Radius " + radius);

        area = 3.1416 * radius * radius;
        System.out.println("Area " + area);
    }
    
    
}
