package taskFour;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean numprime = true;

        if (number <= 1) {
        	numprime = false;
        } else {
            // Check for factors
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                	numprime = false;
                    break;
                }
            }
        }

        // Output result
        if (numprime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        input.close();
	}

}
