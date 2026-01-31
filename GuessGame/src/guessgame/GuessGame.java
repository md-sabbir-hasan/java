
package guessgame;

import java.util.Scanner;

public class GuessGame {

  
    public static void main(String[] args) {
        
//        int randomNumber = (int) (Math.random() * 10);
//        Scanner s = new Scanner(System.in);
//        
//        System.out.println("Enter your Guess Number");
//        int guessNumber = s.nextInt();
//        
//        int chance = 3;
//        boolean flag = true;
//        while (chance>1 && flag){
//        if(guessNumber == randomNumber) {
//            System.out.println("You Win....");
//            flag = false;
//        }
//        
//        else if(guessNumber > randomNumber){
//            System.out.println("Your guess Number is larger");
//            System.out.println("Enter your Guess Number");
//            guessNumber = s.nextInt();
//        }
//        else if(guessNumber < randomNumber){
//            System.out.println("Your guess Number is Smaller");
//            System.out.println("Enter your Guess Number");
//            guessNumber = s.nextInt();
//        }
//        
//        chance--;
//        }
//        
//        System.out.println(randomNumber);

int randomNumber = (int) (Math.random() * 10);
 System.out.println("System Guess= "+randomNumber);
        Scanner s = new Scanner(System.in);
        
        
        
        int chance = 1;
        boolean flag = true;
        while (chance<=3 && flag){
            System.out.println("Enter your Guess Number");
        int guessNumber = s.nextInt();
        if(guessNumber == randomNumber) {
            System.out.println("Congratulation You Win....");
            flag = false;
        }
        
        else if(guessNumber > randomNumber){
            System.out.println("#Your guess Number is larger");
          
        }
        else if(guessNumber < randomNumber){
            System.out.println("#Your guess Number is Smaller");
           
        }
        
        chance++;
        }
        
        
        
        System.out.println("System Guess= "+randomNumber);



//int ch = 1;
//while (ch<=2){
//    System.out.println("BOSS");
//    ch++;
//}



//onle book 211 (hw)



    }
    
}
