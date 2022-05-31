package Inheritance;

public class B extends A{
	int a=20;

	public void printb (int a) {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	//Single inheritance by using extend keyword
	
	public static void main(String[] args) {
		B obj=new B();
		
		obj.printb(2);
		
	////Single inheritance achieved by A==>B
		
				
	}
	
	
}
