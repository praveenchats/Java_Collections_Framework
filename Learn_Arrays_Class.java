package Java_Collections_Framework;
// it is used for a searching, sorting , and convert into arraylist & Check array Are equal or not.
import java.util.*;
public class Learn_Arrays_Class {
    public static void main(String[] args) {
        //  int []arr={1,2,3,4,5,6};
        //int index = Arrays.binarySearch(arr,4); // Binary Search is used and works for a sorted arrays
        // time complexity: Log(n);
        //System.out.println("The index is Present in index :" +index);
        int[] arr = {23, 1, 89, 5, 90, 2};
        Arrays.sort(arr);
        Arrays.fill(arr,12); // fill 12 in array place of all index

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}