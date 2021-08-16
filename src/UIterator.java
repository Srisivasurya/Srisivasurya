import java.util.*;
public class UIterator
{
    public static void main(String[] args)
    {
        ArrayList <String> list = new ArrayList<>();

        list.add(" Ram ") ;
        list.add(" Krishna ") ;
        list.add(" Samuel ") ;
        list.add(" Muhammed ") ;

        System.out.println(" The list is " + list);

        Iterator <String> it = list.iterator();

        System.out.println(" The iterator values of list are : ");

        while(it.hasNext())
        {
            System.out.println(it.next() + " ");
        }

    }
}
