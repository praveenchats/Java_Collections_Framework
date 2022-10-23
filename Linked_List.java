package Java_Collections_Framework;
// oprations: add, remove, contains, get, set, clear,datatype.valueof(),
import java.util.*;
// same as arraylist
public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(12);
        list.add(13);
        list.add(1);
        list.add(99);
        list.remove(3);
        Collections.sort(list);
        System.out.println(list);

    }
}
