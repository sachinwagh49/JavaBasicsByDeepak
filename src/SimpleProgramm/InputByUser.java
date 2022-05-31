package SimpleProgramm;
import java.util.Scanner;
public class InputByUser {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Your Name =");
		String name=s.next();
		System.out.println("Enter your age=");
		int age=s.nextInt();
		System.out.println("Enter Your Gender=");
		char gender=s.next().charAt(0);
		System.out.println("enter your Phone No");
		long phonno=s.nextLong();
		System.out.println("********************************");
		System.out.println("Name="+name);
		System.out.println("********************************");
		System.out.println("Age="+age);
		System.out.println("********************************");
		System.out.println("Gender="+gender);
		System.out.println("********************************");
		System.out.println("Phone No="+phonno);
	}}
