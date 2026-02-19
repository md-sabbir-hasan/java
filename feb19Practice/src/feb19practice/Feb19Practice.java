package feb19practice;

import feb19practice.vehicle.Truck;



public class Feb19Practice {



    public static void main(String[] args) {
        Truck truck = new Truck();
        
        truck.regularPrice = 1000;
        truck.weight = 3000;
        
        double price = truck.getSalePrice();
        
        System.out.println(price);
        
        
        
        factorial f = new factorial();
        
        
        System.out.println(f.factorial(4));

     

    }

}
