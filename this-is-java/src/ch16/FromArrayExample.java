package ch16;

import java.util.Arrays;
import java.util.stream.Stream;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] arr = new String[] {"홍길동", "아무개", "김미나"};
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(a -> System.out.println(a + ","));
	}
}
