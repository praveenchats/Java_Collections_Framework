package Java_Collections_Framework;
// dequeue- it is a double ended key. you can remove the element from front as well as from the end
//& put the element from as well as the end & we can peek from both the sided.
// it is used in the sliding window.
// Operations- offer , add , offerFirst , offerLast, poll, pollFirst , pollLast;
import java.util.*;
public class Learn_Array_dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer>adq=new ArrayDeque<>();
        adq.offer(2);
        adq.offerFirst(9);// it adds the element in the first starting
        adq.offerLast(1);// it adds the element in the last
        adq.offer(98);
        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq);
        System.out.println(adq.peekLast());
        System.out.println(adq.poll());
        System.out.println(adq);
        System.out.println(adq.pollFirst());
        System.out.println(adq);
        System.out.println(adq.pollLast());
        System.out.println(adq);

    }
}
