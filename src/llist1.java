import java.util.*;

class last {
    public static void main(String[] args) {
        LinkedList <String> l_list = new LinkedList <String> ();
        l_list.add("R");
        l_list.add("G");
        l_list.add("B");
        l_list.add("S");
        l_list.add("O");
        System.out.println("The Original linked list: " + l_list);
        Collections.swap(l_list, 0, 2);
        System.out.println("The New linked list after swap: " + l_list);
    }
}