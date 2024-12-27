package Assignment1;

import java.util.Scanner;

public class evenORodd {

    public static void even_odd(int number){
        if(number%2 == 0){
            System.out.println(number+ " is a even number");
        }else{
            System.out.println(number+ " is a odd number ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        even_odd(in.nextInt());
    }
}
