import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

 class Fore {

    public static void main(String[] args)
    {
        List<String> data = new ArrayList<>();
        data.add("New Delhi");
        data.add("New York");
        data.add("Mumbai");
        data.add("London");

        Iterator<String> itr = data.iterator();
        while (itr.hasNext()) {

            System.out.println(itr.next());
        }
    }
}