public class Thread extends Thread {
    public void run()
    {
        int a= 10;
        int b=12;
        int c=5;
        int result = a+b;
        int result1=c*c;
        System.out.println("Thread started running..");
        System.out.println("Sum of two numbers is: "+ result);
        System.out.println("Sum of two numbers is: "+ result1);
    }
    public static void main( String args[] )
    {

        Thread t1 = new  Thread();
        t1.start();
    }
}