package jan28;

import java.util.Scanner;

public class Jan28 {

    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        float bm = s.nextFloat();
//        if (bm < 18.5) {
//            System.out.println("Underweight");
//        } else if (bm <= 25) {
//            System.out.println("Normal");
//        } else if (bm <= 30) {
//            System.out.println("Overweight");
//        } else {
//            System.out.println("obese");
//        }


//even/odd
//
//Scanner s = new Scanner(System.in);
//int number = s.nextInt();
//if(number%2==0){
//    System.out.println("Even");
//}
//else {
//    System.out.println("Odd");
//}


//calculator

//Scanner s = new Scanner(System.in);
//        System.out.println("Enter 1st Number");
//int number1 = s.nextInt();
//        System.out.println("enter operator");
//String op= s.next();
//        System.out.println("Enter 2nd number");
//        int number2 = s.nextInt();
//
//if ("+".equals(op)){
//    System.out.println("Result = "+(number1+number2));
//}
//if ("-".equals(op)){
//    System.out.println("Result = "+(number1-number2));
//}
//if ("*".equals(op)){
//    System.out.println("Result= "+ (number1*number2));
//}
//if ("/".equals(op)){
//    System.out.println("Result= "+(number1/number2));
//}

//optional
//if(op.equals("+")){
//    System.out.println(number1+number2);
//}


//calculator(SwitchCase)

Scanner s = new Scanner(System.in);

System.out.println("Enter 1st Number");
int number1 = s.nextInt();

System.out.println("Enter operator");
String op = s.next();

System.out.println("Enter 2nd Number");
int number2 = s.nextInt();

switch (op) {
    case "+" -> System.out.println("Result = " + (number1 + number2));

    case "-" -> System.out.println("Result = " + (number1 - number2));

    case "*" -> System.out.println("Result = " + (number1 * number2));

    case "/" -> {
        if (number2 != 0) {
            System.out.println("Result = " + (number1 / number2));
        } else {
            System.err.println("Cannot divide by zero");
        }   }

    default -> System.err.println("Invalid operator");
}



    }

}
