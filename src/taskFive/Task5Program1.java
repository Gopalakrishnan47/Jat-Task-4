package taskFive;

import java.util.Scanner;

public class Task5Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        boolean palindrome = true;
        for (int index = 0; index < text.length() / 2; index++) {
            if (text.charAt(index) != text.charAt(text.length() - 1 - index)) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        input.close();
	}

}
