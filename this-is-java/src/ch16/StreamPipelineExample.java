package ch16;

import java.util.Arrays;
import java.util.List;

public class StreamPipelineExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("홍길동", Member.MALE, 30),
			new Member("홍길동", Member.MALE, 30),
			new Member("홍길동", Member.MALE, 30),
			new Member("홍길동", Member.MALE, 30)
		);
		
		double ageAvg = list.stream()
				.filter(m -> m.getSex() == Member.MALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		
		System.out.println(ageAvg);
				
	}
}
