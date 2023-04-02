package projects;

public class PrimeNumberClass {

	public static void main(String[] args) {
		int i = 23;
		boolean isNumberPrime = false;
		for (int j = 2; j < i - 1; j++) {
			if (i % j == 0) {
				isNumberPrime = true;
				break;
			}
		}
		if (isNumberPrime) {
			System.out.println(i + " is prime");
		} else {
			System.out.println(i + " is not prime");
		}
	}
}