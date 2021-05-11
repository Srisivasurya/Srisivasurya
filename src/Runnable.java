class A implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            i=i*5;
            System.out.println("num is"+ i);

        }
    }
}
class B implements Runnable
{
    public void run()
    {
        for(int g=1;g<10;g++)
        {
            g=g*10;
            System.out.println("num is"+g);
        }
    }
}
class Runnable{
    public static void main(String[] args){
    Runnable ob1=new A();
    Runnable ob2=new B();
    Thread t1=new Thread(ob1);
    Thread t2=new Thread(ob2);
    t1.start();
    t2.start();
    }
}