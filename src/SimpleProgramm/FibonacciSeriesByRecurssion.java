package SimpleProgramm;

public class FibonacciSeriesByRecurssion 
{
	static int a=0,b=1,c;
	public static void main(String[] args) {
		System.out.print(a+" "+b);
		FibonacciSeriesByRecurssion obj= new FibonacciSeriesByRecurssion();
		obj.printFb(20);
	}
		
	void printFb(int i) {
		if(i>=1)
		{     
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			printFb(i-1);
		}
	}

}
