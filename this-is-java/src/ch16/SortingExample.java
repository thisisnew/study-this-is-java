package ch16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] {1,5,4,2,3,10,9,0});
		
		intStream
			.sorted()
			.forEach(i -> System.out.println(i));
		
		System.out.println();
		
		List<StudentOrder> list = Arrays.asList(
			new StudentOrder("홍길동", 30),
			new StudentOrder("홍길동2", 40),
			new StudentOrder("홍길동3", 50)
		);
		
		list.stream()
			.sorted()
			.forEach(s -> System.out.println(s.getScore()));
		
		System.out.println();
		
		list.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(s -> System.out.println(s.getScore()));
	}
}
