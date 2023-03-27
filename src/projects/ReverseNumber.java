package projects;

import java.util.Scanner;

public class ReverseNumber {
	/*
	 * Logic implementation consider 
	 * n=input number
	 * get remainder =n%10 
	 * reverse =reverse *10 + remainder
	 * n= number/10
	 */

	static int reverse = 0;

	public static void reverse(int number) {
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;

		}
		System.out.println("Reverse of given number is : " + reverse);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc= new Scanner(System.in);
//		System.out.println("Please enter Number to get Reverse");
//		int n= sc.nextInt();
		int n = 346;
		reverse(n);

	}

}
