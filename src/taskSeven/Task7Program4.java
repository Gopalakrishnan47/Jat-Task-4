package taskSeven;


//Implement exception handling in a Java program that reads data from a file. If the file does not exist, throw a "FileNotFoundException" and display an error message to the user.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task7Program4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file path to read: ");
        String filePath = scanner.nextLine();

        try {
            File file = new File(filePath);
            Scanner fileReader = new Scanner(file);

            System.out.println("File content:");
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }

            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file was not found.");
        } finally {
            scanner.close();
        }
	}

}
