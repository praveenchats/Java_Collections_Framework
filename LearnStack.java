package Java_Collections_Framework;
import java.util.*;
//import java.util.LearnStack;
// LIFO= last in first out
// Operations - push ,pop, peek
public class LearnStack {
    public static void main(String[] args) {
        Stack<String>animals = new Stack<>();
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Elephant");
        System.out.println(animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());
        System.out.println(animals);


    }
}