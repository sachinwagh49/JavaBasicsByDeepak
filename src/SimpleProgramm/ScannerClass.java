package SimpleProgramm;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=s.next();
		System.out.println("Enter Your Age");
		int Age=s.nextInt();
		System.out.println("Enter Your Gender");
		char gender= s.next().charAt(0);
		System.out.println("Enter Your Phone No");
		long phoneno=s.nextLong();
		System.out.println("****************************************");
		System.out.println("Name ="+name);
		System.out.println("Age ="+Age);
		System.out.println("Gender ="+gender);
		System.out.println("Phone No= "+phoneno);

	}

}