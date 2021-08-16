import java.util.Scanner;

class Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = input.nextInt();
        String result = (marks > 40) ? "pass" : "fail";
        System.out.println("You " + result + " the exam.");
        input.close();
    }
}