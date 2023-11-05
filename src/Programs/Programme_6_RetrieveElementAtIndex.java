package Programs;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveElementAtIndex {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Specify the index of the element you want to retrieve
        int indexToRetrieve = 2; // Retrieve the element at index 2 (which is "Blue")

        // Check if the index is within the valid range
        if (indexToRetrieve >= 0 && indexToRetrieve < colors.size()) {
            String element = colors.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + element);
        } else {
            System.out.println("Invalid index. Index is out of range.");
        }
    }
}
