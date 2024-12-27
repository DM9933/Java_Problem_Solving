package Assignment1;

import java.util.Scanner;

public class gretestnumberBETWEENthree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int number1 = in.nextInt();

        System.out.println("Enter the 2nd number ");
        int number2 = in.nextInt();

        System.out.println("Enter the 3rd number ");
        int number3 = in.nextInt();

        if(number1 >= number2 && number2>number3){
            System.out.println(number1+ " is greater than " +number2+ " , " +number3);
        }else if(number2 > number1 && number2 > number3){
            System.out.println(number2+ " is greater than " +number1+ " , " +number3);
        }else{
            System.out.println("Third number is the greatest number which is "+number3);
        }
    }
}
