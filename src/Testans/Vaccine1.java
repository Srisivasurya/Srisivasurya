package Testans;


import java.util.Scanner;

class Vaccine1 {

    public static void main(String[] args) {

        System.out.println("Enter your Age for vaccination");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        try {

            if(age >= 18)
            {
                System.out.println("You are eligible");
            }
            else  {

                throw new VaccineException("You must grow up");
            }

        }
        catch(VaccineException e) {
            System.out.println(" You are not eligible " + " for vaccination "+e);
        }
    }
}
