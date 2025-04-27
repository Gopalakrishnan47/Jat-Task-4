package taskSIX;


// program3
import java.util.Scanner;

public class Circle {
    double radius;

    public Circle() {
    	try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the radius of the circle: ");
			radius = sc.nextDouble();
		}
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
    	
        Circle c1 = new Circle();
        System.out.println("Circumference of c1: " + c1.calculateCircumference());

        Circle c2 = new Circle(5.0);
        System.out.println("Circumference of c2 (radius 5.0): " + c2.calculateCircumference());
        
       
    }
}