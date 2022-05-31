package Static_Concept;

public class Static_concept {
	int Emp_id;
	String Emp_name;
	String Company_name;
	
	Static_concept(int Emp_id, String Emp_name, String Company_name){
		this.Emp_id= Emp_id ;
		this.Emp_name= Emp_name;
		this.Company_name= Company_name;
	}
	
	void display() {
		System.out.println(Emp_id+" "+Emp_name+" "+Company_name);
		
	}
	
	public static void main(String[] args) 
	{
		Static_concept s=new Static_concept(104, "Sachin", "Smart Programming");
		s.display();
	}
	

}
