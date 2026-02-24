
package february23;

import java.util.ArrayList;

public class February23 {

    public static void main(String[] args) {
        ArrayList<Student> sList = new ArrayList<>();
        
        
        sList.add(new Student(100, "Satoro", "satoro@gmail.com"));
        Student s = new Student(101, "Saitama", "saitama@gmail.com");
        
        sList.add(s);
        
        
        
         System.out.println(sList);
    }
    
}
