package taskSIX;


//program2 main method
public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "John", "Doe", 5000);

        System.out.println("Before raise: " + emp.toString());

        emp.raiseSalary(10); // raise salary by 10%

        System.out.println("After 10% raise: " + emp.toString());
    }
}
