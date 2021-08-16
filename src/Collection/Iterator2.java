package Collection;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2 {
    public static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Surya");
        list.add("Meganathan");
        list.add("Prabhakar");
        list.add("SudalaiMuthu");
        list.add("Siva");

        ListIterator it = list.listIterator();
        System.out.println("The list in forward dirction");
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("The list in backward direction : ");

        while (it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }

        System.out.println();
    }
}
