package Java_Collections_Framework;
// Array list is used for a Dynamically store the internal elements

// oprations: add, remove, contains, get, set, clear,datatype.valueof(),
import java.util.*;

public class Array_List {
     // 23,45,98,56,14,3
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();// Empty Array List
         list.add(23);
         list.add(45);
         list.add(98);
         list.add(56);
         list.add(14);
         list.add(3);
         list.add(4,15);
       //  list.remove(4);
         list.remove(Integer.valueOf(45));
         list.set(3,30);
         System.out.println(list.get(3));
         System.out.println(list.contains(50));
         //list.clear();
         System.out.println(list);
        // for(int i=0;i<list.size();i++) {
          //   System.out.println(list.get(i));
         //}
       //  for (Integer element:list) {
         //    System.out.println(element);

         //}
       //  Iterator<Integer>it= list.iterator();
         //while(it.hasNext()){
           //  System.out.println(it.next());
         //}


         /*ArrayList<Integer>newList=new ArrayList<>();
         newList.add(150);
         newList.add(160);
         list.addAll(newList);

         System.out.println(list);
         System.out.println(list.get(1));
         ArrayList<String>StudentName=new ArrayList<>();
         StudentName.add("Praveen");
         StudentName.add("Suyash");
         StudentName.add("Sukla");
         System.out.println(StudentName);*/
     }
}
