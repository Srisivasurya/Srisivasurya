package Decision;

import java.util.Scanner;

public class IeIf {

    public static void main(String[] args) {

        int num1, num2, num3;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter any three numbers: ");
        num1 = read.nextInt();
        num2 = read.nextInt();
        num3 = read.nextInt();

        if( num1>=num2 && num1>=num3)
            System.out.println("\nThe largest number is " + num1) ;

        else if (num2>=num1 && num2>=num3)
            System.out.println("\nThe largest number is " + num2) ;

        else
            System.out.println("\nThe largest number is " + num3) ;


    }

}
