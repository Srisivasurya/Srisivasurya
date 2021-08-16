package BMS;

import java.util.Scanner;

class Account
{
    String name;
    int account_no;
    int salary;
}
class Bank extends Account
{
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name: ");
        name=sc.nextLine();
        System.out.println("Enter your account number: ");
        account_no=sc.nextInt();
        System.out.println("Enter your salary: ");
        salary=sc.nextInt();
    }
}
