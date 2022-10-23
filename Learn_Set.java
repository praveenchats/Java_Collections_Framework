package Java_Collections_Framework;
/* it randomly prints the set. This is happening because inside it hashing is going on.
set makes a hash of our every element. so a hash will be generating for every element
 which are putting here internally and that hash will put inside the collector Here
 this value becomes Corresponding to that's and its is being Checked that if the hash of any element is not
 already present inside the set. Every element has this property that there hash will be Unique.*/

// it ignores the duplicate of elements.
import  java.util.*;
public class Learn_Set {
    public static void main(String[] args) {
      //Set<Integer>set=new HashSet<>(); // Time Complexity -O(1);. Optimized Solution
        // Set<Integer>set=new LinkedHashSet<>(); Time Complexity- O(log N) // it maintains the order of the set.
        Set<Integer>set=new TreeSet<>(); // it works in sorted form. so it does  implementation on binary search tree
        // and with that it also defines the property of set.all the elements inside it will be unique.
        set.add(5);
        set.add(56);
        set.add(33);
        set.add(9);
        set.add(100);
        set.add(8);
        System.out.println(set);
        set.add(5);// ignore the duplicate element.
        System.out.println(set);
        set.remove(56);
        System.out.println(set);
        // set.contains() Return boolean Value
        System.out.println(set.contains(56));
        System.out.println(set.contains(33));
        //set.isEmpty() returns boolean value
        System.out.println(set.isEmpty());
        // set.size returns the size of hash set
        System.out.println(set.size());
        // clear return an empty set
        //set.clear();
        System.out.println(set);

    }
}
