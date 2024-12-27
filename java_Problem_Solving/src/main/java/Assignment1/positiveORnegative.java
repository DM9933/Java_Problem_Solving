package Assignment1;

import java.util.Scanner;

public class positiveORnegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = in.nextInt();

        if(number >= 0){
            System.out.println("The Number is a Positive number which is " +number);
        }else{
            System.out.println("The number is a negative number which is " +number);
        }
    }
}
