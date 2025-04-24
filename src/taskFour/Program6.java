package taskFour;
import java.util.Scanner;
public class Program6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = input.nextInt();

	        long fact = 1;

	        // Check for valid input
	        if (num < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } 
	        else {
	        	
	            // Calculate factorial
	            for (int i = 1; i <= num; i++) {
	                fact *= i;
	            }

	            // Print the result
	            System.out.println("Factorial of " + num + " is: " + fact);
	        }
	        input.close();
	}
}
