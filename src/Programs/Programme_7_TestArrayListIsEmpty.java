package Programs;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_TestArrayListIsEmpty {
    //Main method
    public static void main(String[] args) {
        //Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        //Check if the arraylist is empty
        if (fruits.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        }else {
            System.out.println("The ArrayList is not empty.");
        }

        //Add some elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        //Check again if the ArrayList is empty
        if (fruits.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        }else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}
