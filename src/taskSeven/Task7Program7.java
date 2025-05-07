package taskSeven;

import java.util.ArrayList;
import java.util.List;

public class Task7Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a List of Strings
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Convert List to Array
        String[] array = list.toArray(new String[0]);

        // Display the array elements
        System.out.println("Elements in the array:");
        for (String item : array) {
            System.out.println(item);
        }

	}

}
