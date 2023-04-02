package projects;

import java.util.Scanner;

public class GetWeekDayUWithoutSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input number to Get Week day");
		int day = sc.nextInt();
		
		if(day ==1) {
			System.out.println("Monday");
		} else if(day ==2) {
			System.out.println("Tuesday");
		}else if(day ==3) {
			System.out.println("Wednesday");
		}else if(day ==4) {
			System.out.println("Thursday");
		}else if(day ==5) {
			System.out.println("Friday");
		}else if(day ==6) {
			System.out.println("Saturday");
		}else if(day ==7) {
			System.out.println("Sunday");
		}else {
			System.out.println("Please enter correct day range");
		}
	}

}
