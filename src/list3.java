import java.util.*;
class list3 {
    public static void main(String[] args)
    {
        ArrayList<String> L = new ArrayList<String>();


        L.add("Rohan");
        L.add("Sangeeta");
        L.add("Ritik");
        L.add("Yogesh");
        Vector<String> V = new Vector<String>(L);


        System.out.println(V);
    }
}