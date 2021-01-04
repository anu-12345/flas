package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Test10Set {
public static void main(String[] args) {
	HashSet hs = new HashSet();
	System.out.println(hs);

	hs.add("A");
	hs.add("B");
	hs.add("B");
	hs.add("C");
	hs.add("D");
	hs.add("E");
	hs.add("F");
	
	System.out.println(hs);
	
	HashSet hs1 = new HashSet(hs);
	System.out.println(hs1);
	
	LinkedHashSet lhs = new LinkedHashSet();
	lhs.add("A");
	lhs.add("B");
	lhs.add("C");
	lhs.add("D");
	
	System.out.println(lhs);
	
	
}
}

	