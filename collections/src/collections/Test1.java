package collections;

import java.util.ArrayList;

public class Test1 {

	public static  void main(String[] args)
	{
		
		ArrayList al = new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		System.out.println(al);
		al.add(1,"X");
		al.add(2,"Y");
		al.add(3,"Z");
		al.add(6,"L");
		System.out.println(al);
		al.set(4, "K");
		System.out.println(al);
		al.set(3, "M");
		System.out.println(al);
		//al.set(8, "a");
		//System.out.println(al);
		
		System.out.println(al.get(3));
		System.out.println(al.lastIndexOf("K"));
		
		ArrayList al1 = new ArrayList(al);
		System.out.println(al1);
		
		al.add("K");
		
		al.add(new Integer(10));
		System.out.println(al);
		
		al.add(null);
		al.add(null);
		System.out.println(al);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
