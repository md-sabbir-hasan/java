
package feb19practice.vehicle;

public class vehicle {
  public int speed;  
  public double regularPrice;  
  public String color;  

    public vehicle() {
    }

    public vehicle(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public vehicle(double regularPrice) {
        this.regularPrice = regularPrice;
    }
  
  
  public double getSalePrice(){
  return regularPrice;
  }
}
