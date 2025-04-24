package taskFour;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// Getting the person's age
        System.out.print("Enter age: ");
        int age = input.nextInt();

        // Check if the person is a senior citizen (age more than 60)
        if (age >= 60) {
            System.out.println("The person is a senior citizen.");
        } else {
            System.out.println("The person is not a senior citizen.");
        }
        input.close();
	}
}
