package Collection;

import java.util.LinkedList;
class Llist2 {
    public static void main(String[] args) {
        LinkedList <String> llist = new LinkedList <String> ();
        llist.add("Rat");
        llist.add("Goat");
        llist.add("Bear");
        llist.add("Whale");
        System.out.println("Original linked list: ");
        System.out.println("After insertion " + llist);
        llist.add(1, "Dog");
        System.out.println("The linked list:" + llist);
    }
}
