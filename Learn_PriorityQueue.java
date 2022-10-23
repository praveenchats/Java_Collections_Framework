package Java_Collections_Framework;
// Operation- offer, Comparator.reverseOrder()- reverse the order, peek,poll;
import java.util.*;
public class Learn_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        // in priority Queue it implemented by a MIN HEAP , it sorts the order of queue first the small element ;
        pq.offer(13);
        pq.offer(54);
        pq.offer(2);
        pq.offer(99);
        System.out.println(pq);
       pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);

    }
}
