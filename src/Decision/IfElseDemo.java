package Decision;

import java.util.Scanner;

public class IfElseDemo  {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = read.nextInt();

        if((num % 2) == 0)
        {
            System.out.println("Given number is EVEN number!!");
        }
        else
        {
            System.out.println("Given number is ODD number!!");
        }


    }

}