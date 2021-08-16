package Decision;

import java.util.Scanner;

public class IfDemo {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = read.nextInt();

        if((num % 5) == 0) {
            System.out.println("Given number is divisible by 5!!");
        }

        System.out.println("We are outside the if-block!!!");

    }

}