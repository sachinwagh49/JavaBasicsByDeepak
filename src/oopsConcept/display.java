package oopsConcept;

//Polymorphism_methodoverloading //

public class display
{
	void display(String name,int a) 
	{
		System.out.println(1);
	}
	void display(int a, String name) 
	{
		System.out.println(2);
	}
	public static void main(String[] args) {
		display d=new display();
		d.display(10,"raj");
		System.out.println("***************************");
		display f=new display();
		f.display("raj",30);
	}

}
