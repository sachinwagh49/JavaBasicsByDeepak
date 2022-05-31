package SimpleProgramm;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr First No=");
		int FirstNo=s.nextInt();
		System.out.println("Enter Second No=");
		int SecondNo=s.nextInt();
		System.out.println("Select Opertaion(+,-,X,/)");
		String oper=s.next();
		int result;
		switch(oper) 
		{
		case "+": result=FirstNo+SecondNo;
			System.out.println("Addition of the No="+result);
			break;
		case "-": result=FirstNo-SecondNo;
			System.out.println("Subtraction of the No="+result);
			break;
		case "x": result=FirstNo*SecondNo;
			System.out.println("Multiplication of the No="+result);
			break;
		case "/": result=FirstNo/SecondNo;
			System.out.println("Divion of the No"+result);
			break;
		}
		
	}

}
