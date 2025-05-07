package taskSeven;

import java.util.ArrayList;

public class Task7Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an ArrayList of strings
        ArrayList<String> names = new ArrayList<>();

        // Add some elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Display the original list
        System.out.println("Original ArrayList: " + names);

        // Remove all elements from the list
        names.clear();

        // Display the list after clearing
        System.out.println("ArrayList after removing all elements: " + names);
	}

}
