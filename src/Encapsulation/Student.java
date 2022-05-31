package Encapsulation;

public class Student {

	private int RollNo;
	private String Student_Name;
	private char Grade;
	
	public static void main(String[] args) {
		Student obj= new Student();
		obj.setStudent_Name("Sachin");
		System.out.println(obj.Student_Name);
		obj.setRollNo(231);
		System.out.println(obj.RollNo);
		obj.setGrade('A');
		System.out.println(obj.Grade);
	
	}

	public String getStudent_Name() {
		return Student_Name;
	}

	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public char getGrade() {
		return Grade;
	}

	public void setGrade(char grade) {
		Grade = grade;
	}

}
