package projects;

import java.util.Scanner;

public class MoneyReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter amount for Item bought");
		int bought = input.nextInt();

		System.out.println("Enter the money given");
		int money = input.nextInt();

		int change = money - bought;

		int ten_coins = change / 10;
		int two_coins = (change % 10) / 2;
		// int one_coins =(change%10)%2;
		// System.out.println("Ones "+ one_coins);

		System.out.println("Money Change:");
		System.out.println(ten_coins + " * 10 rupee coin");
		System.out.println(two_coins + " * 2 rupee coin");
		System.out.println("Total " + (ten_coins + two_coins) + " coins");

	}

}
