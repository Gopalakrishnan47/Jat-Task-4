package taskFive;

public class Task5Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}

}
