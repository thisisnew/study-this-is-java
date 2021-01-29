package ch16;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "아무개", "홍길똥", "테스트", "아무개");
		
		names.stream()
			.distinct()
			.forEach(s -> System.out.println(s));
		
		System.out.println();
		
		names.stream()
			.filter(n -> n.startsWith("홍"))
			.forEach(n -> System.out.println(n));
	}
}
