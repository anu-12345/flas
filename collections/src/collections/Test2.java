package collections;

import java.util.Vector;

public class Test2 {

	public static void main(String[] args) {

		/*Vector v = new Vector();
		System.out.println(v.capacity());
	
		Vector v1 = new Vector(20);
		System.out.println(v1.capacity());*/
		
		Vector v2 = new Vector(5,5);
		System.out.println("Initial capacity:"+v2.capacity());
		
		for(int i=0; i<=6; i++)
		{
			v2.add(i);
		}
		System.out.println("Vecot size:"+v2.size());
		System.out.println("initial Capacity:"+v2.capacity());
		System.out.println(v2);
		
		v2.add(13);
		v2.add(14);
		v2.add(15);
		v2.add(16);
		v2.add(17);
		v2.add(19);
		v2.add(18);
		v2.add(17);
		v2.add(19);
		v2.add(18);
		v2.add(17);
		v2.add(19);
		v2.add(18);
		v2.add(17);
		v2.add(19);
		v2.add(18);
		
		System.out.println(v2);
		System.out.println("Vecot size:"+v2.size());
		System.out.println("initial Capacity:"+v2.capacity());
		
		
		
		
		
		
		
		
		
		
		/* for(int i=21; i<=22; i++) {
			 v2.add(i);
		 }
		 System.out.println("Vecot size:"+v2.size());
		System.out.println(v2.capacity());
		System.out.println(v2);*/
		
	}

}
