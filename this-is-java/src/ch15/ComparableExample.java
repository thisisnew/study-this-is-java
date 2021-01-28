package ch15;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동", 95));
		treeSet.add(new Person("테스트", 33));
		treeSet.add(new Person("아무개", 31));
		
		Iterator<Person> itor = treeSet.iterator();
		while(itor.hasNext()) {
			Person person = itor.next();
			System.out.println(person.name + "," + person.age);
		}
	}
}
