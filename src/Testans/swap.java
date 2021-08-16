package Testans;

import java.io.*;

class Swap {

    public static void main(String args[])
    {

        int a=15;
        int b=10;

        int x = 15;
        int y = 5;

        a=a+b;
        b=a-b;
        a=a-b;

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;


        System.out.println("After swap: a = " + a + " b = " + b);
        System.out.println("After swap: x = " + x + ", y = " + y);
    }
}