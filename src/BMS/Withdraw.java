package BMS;

import java.util.Scanner;
import java.lang.Exception;

interface withdraws
{
    public double withdrawFun(int salary);
}

class MyExceptin extends Exception
{
    MyExceptin(String message)
    {
        super(message);
    }
}
 class withdraw implements withdraws
{

    public double withdrawFun(int salary)
    {
        Scanner sc=new Scanner(System.in);
        int withdrawn;

        int balance=0;
        int prev_transaction;
        if(salary!=0)
        {
            System.out.println("Amount you wanna withdraw: ");
            withdrawn=sc.nextInt();
            try
            {
                if(withdrawn>0)
                {
                    balance=salary - withdrawn;
                    prev_transaction= balance;

                    System.out.println("After withdraw your balance is "+balance);
                    System.out.println("****************************************** ");
                }
                else
                {
                    throw new MyException("Deposit cannot be in negative");

                }
            }

            catch(MyException e)
            {
                System.out.println(e.getMessage());
                System.out.println("TRANSACTION FAILURE!!");
            }

        }
        return balance;
    }
}