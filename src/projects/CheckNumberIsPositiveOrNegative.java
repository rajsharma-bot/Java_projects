package projects;

import java.util.Scanner;

public class CheckNumberIsPositiveOrNegative {

	public static void PositiveOrNegative(int number) {

		if (number > 0) {
			System.out.println(number + " Is Positive");
		} else if (number < 0) {
			System.out.println(number + " Is Negative");

		} else {
			System.out.println("Number is zero");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter number to check whether is positive or negative");

		int n = sc.nextInt();

		// Suppose user is passing -2 then system will display number is negative
		// If we enter number as 5 then system will display number is positive
		// If we enter number as 0 then system will display number is zero
		PositiveOrNegative(n);
	}

}
