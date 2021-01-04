package collections;

import java.util.LinkedList;

public class Test5 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");
		System.out.println(ll);
		
		ll.addFirst("A");
		ll.addLast("F");
	    System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll);
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		
	}
}
