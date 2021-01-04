package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test7 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		System.out.println(al);
		Iterator it = al.iterator();
		while(it.hasNext()) {
			String element = (String)it.next();
			System.out.println(element);
		if(element.equals("C")) {
			it.remove();
		}
			
		}
		
		System.out.println(al);
		
	}
}
