package february10.vehicle;

public class Vehicle {
    public int speed;
    public double regularPrice;
    public String color;

    public Vehicle() {
    }

    public Vehicle(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    
    public double getSalePrice(){
           return regularPrice;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "speed=" + speed + ", regularPrice=" + regularPrice + ", color=" + color + '}';
    }
    
    
}
