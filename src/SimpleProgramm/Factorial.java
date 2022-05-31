package SimpleProgramm;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value =");
		int fact=s.nextInt();
		
		for (int i=fact; i>=1; i--) 
		{
			fact= fact*i;
		}
		System.out.println(fact);
	}

}
