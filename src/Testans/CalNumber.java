package Testans;
import java.util.Scanner;

public class CalNumber extends Exception {
    public double calculate(double a, double b, String operator) {
        double answer = 0;
        try {
            if (operator.equals("+")) {
                answer = a + b;
            } else if (operator.equals("-")) {
                answer = a - b;
            } else if (operator.equals("*")) {
                answer = a * b;
            } else if (operator.equals("/")) {
                answer = a / b;
            } else {
                answer = 0;
            }
            return answer;
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("The Exception is occurs : "+ e);
        }

        return answer;
    }
    public static void main(String args[]) {
        CalNumber calNumber=new CalNumber();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        double firstNumber=scan.nextDouble();
        System.out.println("Enter the second number");
        double secondNumber=scan.nextDouble();
        Scanner scan1=new Scanner(System.in);
        System.out.println("Enter the operator");
        String operator=scan1.nextLine();
        double res =calNumber.calculate(firstNumber,secondNumber,null);
        System.out.println("The result is " + res);

    }
}
