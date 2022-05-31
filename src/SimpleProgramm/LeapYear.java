package SimpleProgramm;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Which Year you want check=");
		int year=scn.nextInt();
		if (year%4==0)
			{
			if (year%100==0)
				{
				if (year%400==0)
					{System.out.println("This year is leap Year");
					}
				else 
				{
				System.out.println("This year is not leap Year");
				}
		}
		else
		{
			System.out.println("This year is leap Year");
		}
	}
  else
		 {
			System.out.println("This year is not leap Year");
		 }
		}
		

	}

