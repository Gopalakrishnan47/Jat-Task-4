package taskSeven;

import java.util.Scanner;

public class Task7Program3 {

	
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		public void validateAge() throws InvalidAgeException{ // it will indicate that the method will be throwing and exception
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the age");
			int age = sc.nextInt();
			
			System.out.println("Validating your age....");
			
			if(age > 18) {
				
				System.out.println("You are eligible");
				
			} else {
				
				throw new InvalidAgeException(); // it will throw an exception
				//throw new ArithmeticException();
			} 
			sc.close();
		}
		
		
		public static void main(String[] args){
			// TODO Auto-generated method stub

			Task7Program3 obj = new Task7Program3();
			try {
				obj.validateAge();
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Invalid age entered");
			} 
		}

}
