package collections;

import java.util.TreeSet;

public class Test12 {

	public static void main(String[] args) {
		TreeSet ts =   new TreeSet();
		ts.add("C");
		ts.add("D");
		ts.add("B");
		ts.add("F");
		ts.add("E");
		ts.add("A");
		ts.add("H");
		ts.add("G");
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet("D"));
		System.out.println(ts.tailSet("B"));
		System.out.println(ts.subSet("C","H"));
	}
}
