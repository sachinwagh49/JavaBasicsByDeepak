package SimpleProgramm;

import java.util.Scanner;

public class FactorialByRecursion {
	
	static int fact=1;
	public static void main(String[] args) {

	Scanner s= new Scanner(System.in);
	System.out.println("Enter value which factorial You Want to calculate=");
	int no=s.nextInt();
	FactorialByRecursion s1= new FactorialByRecursion();
	s1.calFact(no);
	System.out.println("factorial of no "+no+" is="+fact);
	}
	void calFact(int no) {
		 
		if( no>=1) 
		{
		    fact = fact*no;
			calFact(no-1);
	}
	}
	
}
