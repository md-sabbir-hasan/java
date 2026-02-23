package idbexamprac;

import idbexamprac.veichle.Truck;

public class IDBExamPrac {
    public static void main(String[] args) {
        Truck truck = new Truck(200, 100);
        
       double price = truck.getPrice();
       
        System.out.println(price);
        
        
    }
    
}
