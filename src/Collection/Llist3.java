package Collection;

import java.util.LinkedList;

class Llist3 {
 public static void main(String[] args) {
  LinkedList<String> llist1 = new LinkedList <String> ();
  llist1.add("Rat");
  llist1.add("Goat");
  llist1.add("Bear");
  llist1.add("Whale");
  System.out.println("the first list:"+llist1);
  LinkedList<String> llist2 = new LinkedList <String> ();
  llist2.add("Ant");
  llist2.add("Bison");
  llist2.add("Ox");
  llist2.add("Shark");
  System.out.println("the second list:"+llist2);
  LinkedList <String> a = new LinkedList <String> ();
  a.addAll(llist1);
  a.addAll(llist2);
  System.out.println("New linked list: " + a);
 }
}
