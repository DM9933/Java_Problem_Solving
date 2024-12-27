package Assignment1;

import java.util.Scanner;

public class calculatorOFtwonumbers {

    public static void calculator(String condition, int x, int y){

        if(condition.equals("+")){
            int sum = x + y;
            System.out.println("Summation of " +x+ " and " +y+ " is " +sum);
        } else if (condition.equals("-")) {
            int sub = x - y;
            System.out.println("Subtraction of " +x+ " and " +y+ " is " +sub);
        } else if (condition.equals("*")) {
            int mul = x * y;
            System.out.println("Multiplication of " +x+ " and " +y+ " is " +mul);
        }else if (condition.equals("/")){
            int div = x / y;
            System.out.println("Division of " +x+ " and " +y+ " is " +div);
        }else{
            System.out.println("Did not Choose any Operator");
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Type Operator: 1. +, 2. -, 3. *, 4. /");
        System.out.println("Enter two numbers:");
        calculator(in.nextLine(),in.nextInt(),in.nextInt());

    }
}
