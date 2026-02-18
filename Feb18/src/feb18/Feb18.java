package feb18;

import java.util.Scanner;

public class Feb18 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give number");
        int number = s.nextInt();
        int c = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                c = c + i;
            }

        }
        if (c == 2) {
            System.out.println("prime");
        } else {
            System.out.println("not Prime");
            
            
            
        }
    }

}


// * prime number 
//* sequnce of int untill a neg int is input, and points the sum of positive int
// * Factorial 5
// * accept 5 number lowest and Highest
// * veihcle class(inheritence)

