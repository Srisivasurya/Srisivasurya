package BMS;

import java.util.*;

 class BankingApplication {

     public static void main(String args[]) {

         Bank obj = new Bank();
         deposit o = new deposit();
         withdraw w = new withdraw();
         Loan l = new Loan();
         int option=0;
         int option2=0;
         int option3=0;
         int balance=0;
         Scanner sc=new Scanner(System.in);

         System.out.println(" SSS BANK ");
         obj.accept();
         do
         {

             System.out.println(" What would you like to do:");
             System.out.println("1. Transaction");
             System.out.println(" 2. Loan");
             System.out.println(" 3. exit");
             option=sc.nextInt();

             switch(option)
             {
                 case 1:

                     System.out.println(" What would you like to do?");
                     System.out.println("1. Deposit");
                     System.out.println("2. Withdraw");
                     System.out.println("3. Previous Transactions");
                     System.out.println(" 4. exit");
                     option2=sc.nextInt();

                     switch(option2)
                     {

                         case 1:

                             o.depositFun(obj.salary);

                             break;

                         case 2:
                             w.withdrawFun(obj.salary);
                             break;

                         case 3:
                             break;

                         default:
                             System.out.println("OOps! something went wrong!");
                             break;
                     }
                     break;


                 case 2:
                     System.out.println("\n");
                     System.out.println(" Which loan you want?");
                     System.out.println("1. Home loan");
                     System.out.println(" 2. Education loan");
                     System.out.println("3. Personal loan");
                     System.out.println(" 4. exit");

                     option3=sc.nextInt();

                     switch(option3)
                     {
                         case 1:
                             l.loan1();
                             break;

                         case 2:
                             l.loan1();
                             break;

                         case 3:
                             l.loan1();
                             break;

                         case 4:
                             break;

                         default:
                             System.out.println("OOps! something went wrong!");
                             break;
                     }
                     break;


                 case 3:
                     break;

                 default:
                     System.out.println("OOps! something went wrong!");
                     break;
             }
         }
         while(option!=3);
     }
 }






