class Multi implements Runnable {
    @Override
    public void run() {

    }
   /* public void run()
    {

            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
    }*/
}
class Multithread
{
    public static void main(String[] args)
    {
        int n = 8;
        for (int i = 0; i < n; i++)
        {
            Thread object = new Thread(new Multi());
            object.start();
        }
    }
}