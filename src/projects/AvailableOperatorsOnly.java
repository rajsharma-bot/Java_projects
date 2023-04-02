package projects;

public class AvailableOperatorsOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		number: 1,2,6,7
//		operators:  +,-,*
//		You can't repeat any number
//		and you can't skip any operator and number
//		You have to create 17 using above rule
		
		int a=1;
		int b=2;
		int c=6;
		int d=7;
		
		int e= ((c-a)*b)+d;
		System.out.println("Total is 17, No number/operator has been repeated or Skiped ");
		System.out.println("((c-a)*b)+d ="+e);

	}

}
