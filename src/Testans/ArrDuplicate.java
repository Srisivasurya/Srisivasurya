import java.util.*;

class ArrDuplicate {

    public static void main(String[] args) {

        List<String> listNames = new ArrayList<String>();

        listNames.add("James");
        listNames.add("Robert");
        listNames.add("Mike");
        listNames.add("Joseph");
        listNames.add("Robert");
        listNames.add("Mike");
        listNames.add("Tom");
        listNames.add("Hogan");
        listNames.add("Daniel");
        listNames.add("Mark");
        listNames.add("Mark");
        HashSet<String> has = new HashSet<String>(listNames);
        System.out.println(has);


    }
}
