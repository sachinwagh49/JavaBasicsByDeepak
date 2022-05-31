package oopsConcept;

public class Animal {
	
	public void eat() {
		System.out.println("Dog is eating");
	}
	public void run() {
		System.out.println("Dog is running");
	}
	public void Sit() {
		System.out.println("Dog is Sitting");
	}
	public void barking() {
		System.out.println("Dog is Barking");
	}
	
	

	public static void main (String[]args) {
		Animal dog=new Animal();
		dog.eat();
		dog.run();
		dog.Sit();
		dog.barking();
		
	
		System.out.println("*************************************************");
	}
}


