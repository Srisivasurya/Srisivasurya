import java.util.*;
public class staticv1{
    static int i = 10;
    static int j;
    static {
        System.out.println("Static block initialized.");
        j = i * 8;
    }

    public static void main(String[] args)
    {
        System.out.println("Inside main method");
        System.out.println("Value of j : "+i);
        System.out.println("Value of n : "+j);
    }
}