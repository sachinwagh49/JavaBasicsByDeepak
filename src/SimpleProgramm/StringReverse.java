package SimpleProgramm;

public class StringReverse {
	public static void main(String[] args) {
	String name= "Sachin Wagh";
	String a [] = name.split(" ");
	String rev= "";
	String firstName= a[0];
	
	for(int i=firstName.length()-1; i>=0; i--) {
		rev =rev + firstName.charAt(i);
		}
	System.out.println(rev+" "+a[1]);


		
	}
	
	}
