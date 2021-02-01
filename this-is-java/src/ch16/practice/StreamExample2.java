package ch16.practice;

import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("홍길동",30),
			new Member("홍길동2",40),
			new Member("홍길동3",26)
		);
		
		double avg = list.stream()
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		System.out.println("평균나이 : " + avg);
	}
}
