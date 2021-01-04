package collections;

import java.util.*;

public class Test3 {
	public static void main(String[] args) {
		
		
		Vector v = new Vector();
		
		v.addElement("A");
		v.addElement("B");
		v.addElement("c");
		v.addElement("D");
		v.addElement("F");
		v.addElement("G");
		
		System.out.println(v);
		
		v.removeElement("A");
		System.out.println(v);
		
		System.out.println(v.firstElement());
		
		System.out.println(v.lastElement());
		
		v.removeAllElements();
		System.out.println(v);
		
		
	}

}
