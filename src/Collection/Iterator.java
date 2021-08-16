package Collection;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

class Iterator1 {
    public static void main(String[] args)
    {
       ArrayList<String> list=new ArrayList<String>();
       list.add("Surya");
       list.add("Meganathan");
       list.add("Prabhakar");
       list.add("SudalaiMuthu");
       list.add("Siva");

       Iterator it = list.iterator();
       System.out.println("The list are");
       while(it.hasNext())
       {
               System.out.print(it.next()+" ");
       }
       System.out.println();
    }
}
