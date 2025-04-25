package taskFive;

import java.util.Scanner;

public class Task5Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner input = new Scanner(System.in);
	        int num1 = input.nextInt();
	        int num2 = input.nextInt();
	        int num3 = input.nextInt();

	        int largest = num1;

	        if (num2 > largest) {
	            largest = num2;
	        }

	        if (num3 > largest) {
	            largest = num3;
	        }

	        System.out.println("The Largest Number is : "+largest);
	        input.close();
	}

}
