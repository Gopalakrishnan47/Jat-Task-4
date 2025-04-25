package taskFive;

import java.util.Scanner;

public class Task5Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        
        int month = input.nextInt();
        double rentPerDay = input.nextDouble();
        int days = input.nextInt();
        float total = (float) 0.0;
        
        boolean isPeakSeason = false;

        switch (month) {
            case 4,5,6,11,12:
                isPeakSeason = true;
                break;
            default:
                isPeakSeason = false;
        }

        if (isPeakSeason) {
            total=(float) ((float) (rentPerDay * 0.20 ) + rentPerDay * days );
        }else {
         total = (float) (rentPerDay * days);
        }
        System.out.println((float) total);

        input.close();
	}

}
