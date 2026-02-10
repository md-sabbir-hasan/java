package february10;

import february10.vehicle.Truck;

public class February10 {
    public static void main(String[] args) {
        
       
        Truck t = new Truck();
        t.regularPrice=5000;
        t.weight = 200;
        System.out.println(t.getSalePrice());
    }
    
}
