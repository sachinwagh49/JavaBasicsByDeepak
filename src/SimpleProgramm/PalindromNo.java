package SimpleProgramm;

public class PalindromNo {

	public static void main(String[] args) {
		int a=121;
		int temp=a;
		int rev=0,rem;
		while(temp !=0)
		{ 
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(a==rev) {
			System.out.println(a+" is Palindrom NO");
		}
		else {
			System.out.println(a+" is not palindrom No");
		}
				

	}

}
