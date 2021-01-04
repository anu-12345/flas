package collections;

import java.util.Enumeration;
import java.util.Vector;

public class Test6 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
		
		
	}
}
