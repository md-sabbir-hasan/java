
package learnobjectclass.geometri;

public class Energy {

    public Energy() {
    }

    public Energy(double m) {
        this.m = m;
    }
    
    
   double c = (3* Math.pow(10, 8));
   public double m ;
   
   public double energy(){
   return  (m*Math.pow(c, 2));
   
   }
    
    
    
    
}
