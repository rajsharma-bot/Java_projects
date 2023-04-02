package infiniteLoops;

public class InfiniteForLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int n=5;
		for(int i=1;i<n;i--) {
			
			//Since we are using two instance variable n and i 
			// in for loop we are entering condition 
			// Every time in "For loop" for variable "i" there is decrement after loop is executed
			// due to this condition i<n will be never satisfied and "For loop will run to Infinite times
			
			System.out.println("Infinite For Loop");
		}

	}

}
