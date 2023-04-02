package projects;

public class GetPrimeNumber {
	int temp;
	
	public static void prime(int number) {
		int temp1=1;
		
		while(temp1<=number) {
			int temp=0;
			for(int i=2;i<(temp1/2);i++) {
				if(temp1%i==0) {
					temp=i;
					break;
				}
			}
			if(temp==0) {
				System.out.println(temp1);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int times = 20;
		prime(times);

	}

}
