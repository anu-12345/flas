package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class Test8 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		
		System.out.println(ll);
		
		ListIterator lit = ll.listIterator();
		System.out.println("Elements In Forword Direction");
		while(lit.hasNext()) {
			System.out.println(lit.nextIndex()+"--->"+lit.next());
			
		}
		System.out.println("Elements In backword Direction");
		while(lit.hasPrevious()){
			System.out.println(lit.previousIndex()+"--->"+lit.previous());
			
		}
		
		
		}
}
