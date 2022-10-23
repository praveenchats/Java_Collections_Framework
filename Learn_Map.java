package Java_Collections_Framework;
// we can store key value pair in it and all the keys are unique, & Values may be or may not be Unique but keys are
// always unique.
import java.util.*;
public class Learn_Map {
    public static void main(String[] args) {
        //  Map<String,Integer>num=new HashMap<>(); // Unordered key value pair
       Map<String,Integer>num=new TreeMap<>(); // it isb used for a sorted manner and ordered pair
       num.put("One",1);
       num.put("Two",2);
       num.put("Three",3);
       num.put("Four",4);
       num.put("Five",5);
       num.remove("Three");
      //System.out.println(num);
        //if(!num.containsKey("Five")){ // if statement check value is present or not in map containsKey check value
          //  num.put("Five",32);
        //}

        num.putIfAbsent("Five",32); // same as if statement

    //   num.put("Five",32); // override the key pair value mean update
        System.out.println(num);
        for(Map.Entry<String,Integer>e:num.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for(String key:num.keySet()){
            System.out.println(key);
        }
        for(Integer value:num.values()){
            System.out.println(value);

        }
        System.out.println(num.containsValue(3));
        System.out.println(num.isEmpty());
    }
}
