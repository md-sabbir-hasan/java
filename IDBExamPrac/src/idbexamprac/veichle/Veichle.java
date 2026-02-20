
package idbexamprac.veichle;

public class Veichle {
    int speed;
    String color;
    double regularPrice;

    public Veichle() {
    }

    public Veichle(int speed, String color, double regularPrice) {
        this.speed = speed;
        this.color = color;
        this.regularPrice = regularPrice;
    }

    public Veichle(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    
    
    public double getPrice() {
    return regularPrice;
    }
}
