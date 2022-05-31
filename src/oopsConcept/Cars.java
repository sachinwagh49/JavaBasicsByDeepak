package oopsConcept;
//intialization using method//

public class Cars {
	int manufacturing_year;
	String colour;
		void car_detail(int i, String y) {
			manufacturing_year=i;
			colour=y;
		}
		void display() {
			System.out.println("Tata sumo Colour is="+colour);
			
			System.out.println("Tata sumo maufaturing year is="+manufacturing_year);

		}
		 
		
		 public static void main(String[] args) {
				Cars tatasumo=new Cars();
				tatasumo.car_detail(2008, "brown");
				tatasumo.display();

			}
}

