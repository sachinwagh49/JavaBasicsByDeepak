package SimpleProgramm;

import java.util.Scanner;

public class LearYearBySimpleMethod 
{
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter year=");
		int year=scn.nextInt();
		
		if ((year%400==0)||(year%4==0 && year%100!=0))
				{
			System.out.println("leap Year");
				}
		else {
			System.out.println("not leap Year");
		}
		
	}
	

}
