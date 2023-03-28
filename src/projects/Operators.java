package projects;

public class Operators {
	
	
	public static void getOperatorsint(int number1,int number2,int number3,int number4) {
		
		
		int output=( (number3-number1)*number2 ) +number4;
		System.out.println("No number has been used twice and each Operators is used once ");
		System.out.println("Using operators - +,-,* is = " + output);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Num1=1;
		int Num2=2;
		int Num3=6;
		int Num4=7;
		
		getOperatorsint(Num1, Num2, Num3, Num4);

	}

}
