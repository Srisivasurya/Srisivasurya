/*import java.io.*;			      // for I/O
///////////////////////////////////////////////////////////////////
class BankAccount
{
    private double balance;		      // account balance

    public BankAccount(double openingBalance)  // constructor
    {
        balance = openingBalance;
    }

    public void deposit(double amount)	      // makes deposit
    {
        balance = balance + amount;
    }

    public void withdraw(double amount)	      // makes withdrawal
    {
        balance = balance - amount;
    }

    public void display()		      // displays balance
    {
        System.out.println("balance=" + balance);
    }

}  // end class BankAccount
////////////////////////////////////////////////////////////////////
class BankApp2
{
    public static void main(String[] args) throws IOException
    {

        try     // try means an exception WILL NOT exit methd

        {

            double value;

            System.out.print("Enter the opening balance: ");
            System.out.flush();

            double balance = getDouble();
            BankAccount Account = new BankAccount(balance);

            double withdraw = getDouble();
            System.out.print("Before transactions, ");
            Account.display();

            if (balance < withdraw)
                throw new Exception ("Error");

            Account.withdraw(withdraw);

            System.out.print("After transactions, ");
            Account.display();

        } // end try

// catch must appear immediately after try block
// can have several catches, one for each type of exception
// we might throw within the try block

// built-in exception types: exception, NullPointerException, DivZero,
// etc.

        catch (Exception e) {

            System.out.println("Error- withdrawal amount exceeds balance");

        }

// here is another exception handler ... inside a loop

        int val = 0;

        while (true) {

            try {

                if (val == 0) throw new Exception();
                break;

            }

            catch(Exception f){
                val++
            }

        } // end while (true)


    }	  // end main(){

    public static String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        String s = br.readLine();
        return s;
    }

    public static double getDouble() throws IOException
    {
        String s = getString();
        Double aDub = Double.valueOf(s);
        return aDub.doubleValue();
    }*/