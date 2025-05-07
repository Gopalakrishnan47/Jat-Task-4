package taskSeven;


//Write the code of ArrayIndexOutOfBoundsException& StringIndexOutOfBoundsException
public class Task7Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // ArrayIndexOutOfBoundsException example
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing 5th element of array: " + numbers[4]); // Index 4 does not exist
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        }

        // StringIndexOutOfBoundsException example
        try {
            String text = "Hello";
            System.out.println("Character at index 10: " + text.charAt(10)); // Index 10 does not exist
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index out of bounds.");
        }
	}

}
