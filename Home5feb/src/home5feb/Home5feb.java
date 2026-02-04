package home5feb;

import java.util.Arrays;
import java.util.Scanner;

public class Home5feb {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("How many Number Want to push this Array");
        int count = s.nextInt();
        int arr[] = new int[count];
        System.out.println("Before value push " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter your " + (i+1) + " value");
        int userInput = s.nextInt();
            arr[i] = userInput;

        }
        System.out.println("After entaring Value " + Arrays.toString(arr));

    }

}
