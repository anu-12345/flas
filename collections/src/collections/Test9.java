package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test9 {
public static void main(String[] args) {
	
	LinkedList ll = new LinkedList();
	
	ll.add("A");
	ll.add("B");
	ll.add("C");
	ll.add("D");
	ll.add("E");
	System.out.println(ll);
	
	ListIterator lit = ll.listIterator();
	
	while(lit.hasNext()) {
		String element = (String)lit.next();
		if(element.equals("C")) {
			lit.add("F");
		}
		if(element.equals("E")) {
			lit.set("G");
		}
		//if(element.equals("D")) {
		//lit.remove();
			
	//	}
	}
	System.out.println(ll);
	
}
}
