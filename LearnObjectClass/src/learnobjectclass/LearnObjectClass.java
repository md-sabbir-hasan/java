
package learnobjectclass;

import java.util.Scanner;
import learnobjectclass.geometri.Circle;
import learnobjectclass.geometri.Energy;
import learnobjectclass.geometri.Rectengle;

public class LearnObjectClass {

    public static void main(String[] args) {
        
        Circle c = new Circle();
        c.radius = 10;
        System.out.println(c.getArea()); 
        System.out.println(c.getPerimeter()); 
        
        
        Scanner s= new Scanner(System.in);
        Rectengle r = new Rectengle();
        r.height = s.nextDouble();
        r.width = s.nextDouble();
        
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        
        
        Energy eny = new Energy();
        eny.m = s.nextDouble();
        System.out.println(eny.energy());
    }
    
}
