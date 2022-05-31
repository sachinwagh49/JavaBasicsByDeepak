package SimpleProgramm;

import java.util.Arrays;

public class GreaterWorldinString {
	
	public static void main(String[] args) {
		String str1=" ";
		int k=0;
		String str= "India is my country";
		int  length=str.length();	
		for (int i=0; i<=str.length()-1; i++) {
				str1=str1+str.charAt(i);
				if (str.charAt(i)==' ') {
					String[] word = new String[3];
					word [k]=str1; 
					str1=" ";
					k++;
				}
				continue;	
		}
	}
}
