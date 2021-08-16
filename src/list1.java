import java.util.ArrayList;
public class list1 {

    public static void main(String a[])
    {

        ArrayList<String> ArrList1 = new ArrayList<String>();
        ArrList1.add("Mukul");
        ArrList1.add("Rahul");
        ArrList1.add("Suraj");
        ArrList1.add("Mayank");
        System.out.println("Original ArrayList = " + ArrList1);


        ArrayList ArrList2 = (ArrayList)ArrList1.clone();
        System.out.println("Clone ArrayList2 = " + ArrList2);
    }
}
