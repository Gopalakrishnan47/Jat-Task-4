package taskSeven;

import java.util.Scanner;

//Write a Java program that reads user input for two integers and performs division. Handle the exception that is thrown when the second number is zero, and display an error message to the user.
public class Task7Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        try {
            // Read two integers from the user
            System.out.print("Enter the first number: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int denominator = scanner.nextInt();

            // Perform division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            // Handle any other input errors
            System.out.println("Error: Invalid input. Please enter integers.");
        } finally {
            scanner.close();
        }
	}

}
