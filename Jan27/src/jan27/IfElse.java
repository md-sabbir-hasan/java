package jan27;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius(Numeric)");
        float radius = scanner.nextFloat();
        float areaOfCircle;
        if (radius <= 0) {
            System.out.println("Incorrect Value");
        } else {
            areaOfCircle = (float) (Math.PI * Math.pow(radius, 2));
            System.out.println("Area= " + areaOfCircle);
        }
    }

}
