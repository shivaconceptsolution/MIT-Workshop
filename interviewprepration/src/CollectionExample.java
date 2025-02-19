import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
     //   List<String> list = new ArrayList<String>();
    //    List<String> list = new LinkedList<String>();
       List<String> list = new Vector<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.addFirst("F");
        list.removeFirst();
        list.remove("D");

      /*  Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/
        ListIterator<String> it = list.listIterator();
        System.out.println("Display data in forward direction");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Display data in backward direction");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
       /* for (String s : list) {
            System.out.println(s);
        }*/
    }
}
