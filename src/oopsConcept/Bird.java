package oopsConcept;

//intialization using referance variable//

public class Bird {
	
	//parameter of object 
	int age;
   String colour;
   
	 public static void main(String[] args) {
			Bird sparrow=new Bird();
			
			//object with parameter
			
			sparrow.age=6;
			sparrow.colour="brown";
			
			System.out.println("Sparrow Colour is="+sparrow.colour);
			
			System.out.println("Sparrow age is="+sparrow.age);

			System.out.println("*************************************************");
		}
}
