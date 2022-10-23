package Java_Collections_Framework;
import java.util.*;
//FIFO - First in First Out
// Queue is an interface which is an implemented by an arraylist , LinkedList , PriorityQueue
// Function - add,(offer,poll,peek), element, remove
public class Learn_Queue {
    public static void main(String[] args) {
    Queue<Integer>queue=new LinkedList<>();
        queue.offer(12); // offer-add the element
        queue.offer(56);
        queue.offer(13);
        queue.offer(98);
        System.out.println(queue);
        System.out.println(queue.poll());
       // queue.poll();

        System.out.println(queue);
      //  System.out.println(queue.peek());
        System.out.println(queue.element());
}
}