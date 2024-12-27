package Assignment1;

import java.util.Scanner;

public class sumOFnaturalnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = in.nextInt();
        int sum = 0;

        for(int i = 1; i <= number; i++){
            sum = sum + i;
        }
        System.out.println("Sum of the Natural numbers is = " +sum);
    }
}
