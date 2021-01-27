package ch14;

import java.util.function.Predicate;

public class PredicateIsEqualExample {
	public static void main(String[] args) {
		Predicate<String> predicate;
		
		predicate = Predicate.isEqual(null);
		System.out.println("null과 null 비교: " + predicate.test(null) );
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("null과 Java8 비교: " + predicate.test(null) );
		
		predicate = Predicate.isEqual(null);
		System.out.println("Java8과 null 비교: " + predicate.test("Java8") );
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("Java8과 Java8 비교: " + predicate.test("Java8") );
	}
}
