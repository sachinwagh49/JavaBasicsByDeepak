package SimpleProgramm;

public class StringPartReverse {
	public static void main(String[] args) {
		String s= "Sachin Wagh";
		
		String rev= "";
		for(int i=5; i>=0;	i--) {
			rev= rev+s.charAt(i);
		}
		s.replaceFirst(rev, s);

}
}
