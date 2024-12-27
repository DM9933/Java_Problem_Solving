package Assignment1;

import java.util.Scanner;

public class maximumOFthreenumbers {

    public static void maxNumber(int x, int y, int z){

        if((x >= y) && (x >= z)){
            System.out.println("The Maximum number between " +x+ ", " +y+ " and " +z+ " is " +x);
        }else if((y >= x) && (y >= z)){
            System.out.println("The Maximum number between " +x+ ", " +y+ " and " +z+ " is " +y);
        }else{
            System.out.println("The Maximum number between " +x+ ", " +y+ " and " +z+ " is " +z);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        maxNumber(in.nextInt(),in.nextInt(),in.nextInt());
    }
}
