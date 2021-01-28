package ch15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("iBatis");
		
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
			if(name.equals("JDBC")) {
				iterator.remove();
			}
		}
		
		set.remove("iBatis");
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
	}
}
