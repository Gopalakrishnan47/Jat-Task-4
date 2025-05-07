package taskSeven;

import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;

public class Task7Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add entries to the map
        employeeMap.put(102, "Alice");
        employeeMap.put(101, "David");
        employeeMap.put(104, "Charlie");
        employeeMap.put(103, "Bob");

        // Extract names into a list
        ArrayList<String> names = new ArrayList<>(employeeMap.values());

        // Sort the names alphabetically
        Collections.sort(names);

        // Print names in alphabetical order
        System.out.println("Employee names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
	}

}
