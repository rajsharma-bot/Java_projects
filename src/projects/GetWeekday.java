package projects;

import java.util.Scanner;

public class GetWeekday {

	public static String getWeekDayName(int day) {

		String dayName = "";
		switch (day) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default:
			dayName = "Please enter correct day range";
			break;
		}
		return dayName;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input number to Get Week day");
		int day = sc.nextInt();
		
		
		System.out.println(getWeekDayName(day));

	}

}
