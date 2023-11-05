package Programs;

import java.util.HashMap;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {
    //Main method
    public static void main(String[] args) {
        // Create a HashMap to store String keys and Integer values
        HashMap<String, Integer> people = new HashMap<>();

        // Add some key-value pairs to the map
        people.put("Alice", 25);
        people.put("Bob", 30);
        people.put("Charlie", 35);
        people.put("David", 40);

        // Iterate through the values in the map using a for-each loop
        System.out.println("Values in the 'people' map:");
        for (Integer age : people.values()) {
            System.out.println(age);
        }
    }
}
