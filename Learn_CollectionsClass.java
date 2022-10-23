package Java_Collections_Framework;
// it defines the small functions like that which is the (min & max & Frequency) element inside this collection
// Operations: Collections.min , Collections.max ,Collections.frequency , Collections.sort;
import java.util.*;
public class Learn_CollectionsClass {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(98);
        list.add(98);
        list.add(98);
        list.add(45);
        list.add(2);
        list.add(48);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Comparator.reverseOrder()); // sort the array elements in reverse order
        System.out.println(list);
        System.out.println("min Element is :" +  Collections.min(list));
        System.out.println("Max Element is :" +  Collections.max(list));
        System.out.println("Frequency of 98 is :" + Collections.frequency(list,98));
    }
}
