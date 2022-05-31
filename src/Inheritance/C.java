package Inheritance;

public class C extends B {
	
	public void printc () {
		System.out.println("3");
	}
	
	public static void main(String[] args) {
		C k=new C();
		k.printa();    // A class property inherite in class c without extending a class because of B
		k.printb(30);
		k.printc();
		
	//Multiple inheritance achieved by A==>B==>C
		
				
	}

}
