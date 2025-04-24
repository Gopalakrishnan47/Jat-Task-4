package taskFour;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
       
        int count = 0;
        if (num == 0) {
            count = 1; // Special case for 0
        } else {
            while (num > 0) {
                num /= 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
        input.close();
	}

}
