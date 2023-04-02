package projects;

import java.util.Scanner;

public class CheckNumberIsPostiveOrNegative {

	public static void PostiveOrNegative(int number) {

		if (number > 0) {
			System.out.println(number + " Is Postive");
		} else if (number < 0) {
			System.out.println(number + " Is Negative");

		} else {
			System.out.println("Number is zero");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter number to check whether is postive or negative");
		
		int n= sc.nextInt();
		
		PostiveOrNegative(n);
	}

}
