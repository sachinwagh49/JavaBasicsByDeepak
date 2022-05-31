package Abstract;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Puzzle {
	
	public static void main(String[] args) {
		
		Map<Integer,String > mymap=new HashMap();
		for (int l=1; l<=1100; l++) {
		mymap.put(l, "Tail");}
		System.out.println(mymap);
		for (int i=1; i<=1100; i++) {
			for(int j=1; j<=1100; j++) {
				int k=i*j;
				if (k<=1100) {
			  System.out.print(" "+k);
				 if (i%2==0) { 
				mymap.replace(k, "head");
				}
				 else {
					 mymap.replace(k, "Tail");
				 }
					 
				 }
				
			}
			 System.out.println(mymap);
			System.out.println();
		}
		System.out.println("final is= "+mymap);
		int Tailcount=Collections.frequency(mymap.values(), "Tail");
		int Headcount=Collections.frequency(mymap.values(), "head");
		System.out.println("Tail Count is ="+Tailcount+" & Head Count="+Headcount);
		
	}}