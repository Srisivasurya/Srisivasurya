import java.lang.*;

public class Buffer {

    public static void main(String[] args)
    {

        StringBuffer sbf = new StringBuffer("Surya");
        System.out.println("String buffer = " + sbf);
        sbf.appendCodePoint(43);

        System.out.println("After appending CodePoint is = " + sbf);
    }
}
