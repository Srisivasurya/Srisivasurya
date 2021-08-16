    class Thread2 extends Thread {
    public void run()
    {
        System.out.println("geeks ");
        try {
            Thread.sleep(300);
        }
        catch (InterruptedException ie) {
        }
        System.out.println("forgeeks ");
    }
    public static void main(String[] args)
    {
        Thread2 c1 = new Thread2();
        Thread2 c2 = new Thread2();
        c1.start();
        c2.start();
        System.out.println(c1.isAlive());
        System.out.println(c2.isAlive());
    }
}