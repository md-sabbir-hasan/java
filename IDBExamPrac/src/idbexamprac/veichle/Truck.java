
package idbexamprac.veichle;

public class Truck extends Veichle{
    int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, String color, double regularPrice) {
        super(speed, color, regularPrice);
        this.weight = weight;
    }

    public Truck(int weight, double regularPrice) {
        super(regularPrice);
        this.weight = weight;
    }
    

    @Override
    public double getPrice() {
       if (weight > 2000){
       return regularPrice - regularPrice*0.1;
       }
       return regularPrice;
    }
    
    
}
