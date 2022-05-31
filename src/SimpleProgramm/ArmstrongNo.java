package SimpleProgramm;

public class ArmstrongNo {
	public static void main(String[] args) {
		int a=153;
		int t=a;
		int length=0;
		while(t!=0)
		{
			t=t/10;
			length=length+1;
			
		}
		System.out.println(length);
		
	 	int t2=a;
	 	int armstrongNo=0;
	 	int rem;
	 	while(t2!=0) {
	 		int mul=1;
	 		rem=t2%10;
	 		for(int i=1;i<=length;i++) {
	 			mul=mul*rem;
	 			System.out.println(mul);
	 		}
	 		armstrongNo=armstrongNo+mul;
	 		t2=t2/10;
	 	}
	 	System.out.println(armstrongNo);
	 	if (a==armstrongNo)
	 		System.out.println(a+ " no is armstrong no");
	 	else
	 		System.out.println(a+"  no is not armstrong no");
	 }
	}



