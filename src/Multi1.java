class Multi1 extends Thread
{
  /*public void run()
    {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");

    }*/

    @Override
    public void run() {
        super.run();
    }
}

 class Multithread1 {
    public static void main(String[] args)
    {
        int n = 8;
        for (int i = 0; i < n; i++) {
            Multi1 object = new Multi1();
            object.start();
        }
    }
}