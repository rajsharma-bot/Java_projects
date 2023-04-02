package projects;

import java.util.Scanner;


public class TemperatureScale {

	public static void temperature(Float celsius) {

		Float Fahrenheit = (float) ((celsius * 1.8) + 32);

		System.out.println(celsius + " celsius = " + Fahrenheit + " Fahrenheit");

		int Kelvin = (int) (celsius + 273);

		System.out.println(celsius + " celsius = " + Kelvin + " Kelvin");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Temperature in celsius");
		Scanner sc=new Scanner(System.in);
		Float celsius= sc.nextFloat();
		temperature(celsius);
	

	}

}
