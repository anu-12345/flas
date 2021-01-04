package collections;

import java.util.HashMap;

public class Test11Map {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("a", "Apple");
		hm.put("b","ball");
		hm.put("c","cat");
		hm.putIfAbsent("d", "Dog");
		
		System.out.println(hm);
		
		HashMap hm1 = new HashMap();
		
		hm1.put("x","xxx");
		hm1.put("y","yyy");
		System.out.println(hm1);
		
		hm1.putAll(hm);
		System.out.println(hm1);
		
		System.out.println(hm.get("a"));
		System.out.println(hm.remove("b"));

		System.out.println(hm);
		
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		
		System.out.println(hm.containsKey("c"));
		System.out.println(hm.containsValue("Dog"));
	
		System.out.println(hm1.containsKey("Z"));
		System.out.println(hm1.containsValue("zzz"));
		
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
	}
}
