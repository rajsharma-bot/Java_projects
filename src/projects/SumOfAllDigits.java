package projects;

import java.util.Scanner;

public class SumOfAllDigits {

	static int sumOfNumber = 0;

	public static void sum(int number) {
		while (number != 0) {
			int remainder = number % 10;
			sumOfNumber = sumOfNumber + remainder;
			number = number / 10;
		}
		System.out.println(sumOfNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using Scanner class to get input from user
		Scanner sc=new Scanner(System.in); // creating object 
		System.out.println("Please Enter number to get Sum of all digits"); // Passing value as 234
		int n= sc.nextInt();
		sum(n);//calling method to get output 
		//Output will be 9

	}

}
