public class Staticblock {
    static int c=10;
    static int s;
    static{
        System.out.println("Static initialized");

            s=c*2;

    }
    public static void main(String[] args)
    {
        System.out.println("Inside main method");
        System.out.println("Value of c : "+c);
        System.out.println("Value of s : "+s);
    }
}
