package projects;

import java.util.Scanner;

public class PrimeNumberClass {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Plese Enter number to check whether its prime number or not");
		int i = sc.nextInt();
		boolean isNumberPrime = false;
		for (int j = 2; j < i - 1; j++) {
			if (i % j == 0) {
				isNumberPrime = true;
				break;
			}
		}
		if (isNumberPrime== false) {
			System.out.println(i + " is prime");
		} else {
			System.out.println(i + " is not prime");
		}
	}
}