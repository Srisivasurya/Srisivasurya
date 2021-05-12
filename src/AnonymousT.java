class AnonymousT
{
    public static void main(String[] args)
    {

        Thread t= new Thread(){
            public void run()
            {
                setName("Anonymous Thread");
                System.out.println("Name of the other thread - " + getName());
                for(int i=0;i<3;i++)
                {   i=i*i;
                    System.out.println(getName() + " " + i);
                }

            }
        };
        t.start();
        System.out.println("Name of main thread - "+ Thread.currentThread().getName());
    }
}