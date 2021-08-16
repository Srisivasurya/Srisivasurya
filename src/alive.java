class Threads extends Thread {
    public void run()
    {
        System.out.println("surya ");
        try {
            Thread.sleep(300);
        }
        catch (InterruptedException ie) {
        }
        System.out.println("siva ");
    }
    public static void main(String[] args)
    {
        Threads c1 = new Threads();
        Threads c2 = new Threads();
        c1.start();
        c2.start();
        System.out.println(c1.isAlive());
        System.out.println(c2.isAlive());
    }
}