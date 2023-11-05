package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10_LondonUndergroundLines {
    //Main method
    public static void main(String[] args) {
        // Create a mapping of stations to lines (Zone 1 stations)
        Map<String, String> stationToLine = new HashMap<>();
        stationToLine.put("Baker Street", "Bakerloo");
        stationToLine.put("Kings Cross St Pancras", "Circle, Hammersmith & City, Metropolitan, Northern, Piccadilly, Victoria");
        stationToLine.put("Waterloo", "Bakerloo, Jubilee, Northern, Waterloo & City");
        // Add more stations and their corresponding lines here...

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a station name in Zone 1:");
        String stationName = scanner.nextLine();
        //if-else function
        if (stationToLine.containsKey(stationName)) {
            String lines = stationToLine.get(stationName);
            System.out.println("The station '" + stationName + "' is on the following lines: " + lines);
        } else {
            System.out.println("The station '" + stationName + "' is not in Zone 1 or is not recognized.");
        }
        //Scanner closed
        scanner.close();
    }
}
