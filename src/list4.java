import java.util.ArrayList;
import java.util.List;

public class list4 {

    public static void main(String[] args)
    {

        ArrayList<String> ArrList = new ArrayList<String>();
        ArrList.add("1");
        ArrList.add("2");
        ArrList.add("3");
        System.out.println("ArrayList = " + ArrList);
        List<String> ListItem = new ArrayList<String>();
        ListItem.add("4");
        ListItem.add("5");
        ArrList.addAll(ListItem);
        System.out.println("After Adding List in ArrayList = "+ ArrList);
    }
}