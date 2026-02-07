/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnobjectclass.geometri;

/**
 *
 * @author Admin
 */
public class Circle {
    public double radius;
    public double getArea(){
    double result = Math.PI * Math.pow(radius, 2);
    return result;
            
    }
    
    
    public double getPerimeter(){
    double result = 2*Math.PI*radius;
    return result;
    }
}
