package SimpleProgramm;

public class GreaterBtwnThree {

	public static void main(String[] args) {
		int a=200, b=900, c=909;
		if (a>b)
		{ 
			if (a>c) 
			{
				System.out.println("a is greater");
			}
			else 
			{
				System.out.println("c is greater");
			}
		}

		else if (b>c)
		{
			System.out.println("b is grater");
		}
		else {
			System.out.println("c is greater");
		}
	}

}
