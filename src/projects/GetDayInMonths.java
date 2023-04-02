package projects;

import java.util.Scanner;

public class GetDayInMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter month in number to know days in month");
		int month=sc.nextInt();
		System.out.println("Please Enter Year for month");
		int year=sc.nextInt();
		
	
		
		if(month == 1) {
			System.out.println("January having 31 days");
		} else if(month == 2) {
			if(year%4 ==0) {
				System.out.println("February having 29 days");
			}else {
				System.out.println("February having 28 days");
			}
			
		}
		else if(month == 3) {
			System.out.println("March having 31 days");
		}else if(month == 4) {
			System.out.println("April having 31 days");
		}else if(month == 5) {
			System.out.println("May having 31 days");
		}else if(month == 6) {
			System.out.println("June having 31 days");
		}else if(month == 7) {
			System.out.println("July having 31 days");
		}else if(month == 8) {
			System.out.println("August having 31 days");
		}else if(month == 9) {
			System.out.println("September having 31 days");
		}else if(month == 10) {
			System.out.println("October having 31 days");
		}else if(month == 11) {
			System.out.println("November having 31 days");
		}else if(month == 12) {
			System.out.println("January having 31 days");
		}else {
			System.out.println("Please enter valid Month range");
		}
		

	}

}
