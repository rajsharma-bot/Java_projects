package starProgram;

public class AllPatternInOneProgram {

	public static void Pattern1(int number) {

		for (int i = 1; i <= number; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void Pattern2(int number) {

		for (int i = 1; i <= number; i++) {
			for (int j = i; j <= number; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void Pattern3(int number) {

		for (int i = 1; i <= number; i++) {
			for (int j = i; j <=number ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void Pattern4(int number) {
		for (int i = 1; i <= number; i++) {

			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<=number;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		Pattern3(n);

	}

}
