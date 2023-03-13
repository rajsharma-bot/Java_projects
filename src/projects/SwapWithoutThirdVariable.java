package projects;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		int j = 7;

		System.out.println("Before swap value of i is " + i + " value of j is " + j);
		i = i + j;
		j = i - j;
		i = i - j;

		System.out.println("After swap value of i is " + i + " value of j is " + j);

	}

}
