package Programs;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme_5_ArrayListIteration {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Grapes");

        // Create an Iterator to iterate through the ArrayList
        Iterator<String> iterator = fruits.iterator();

        System.out.println("Iterating through the ArrayList using Iterator:");

        // Use a while loop to iterate through the elements
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}
