package ch16;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 95),
			new Student("홍길동2", 55),
			new Student("홍길동3", 65)
		);
		
		int sum1 = studentList.stream()
				.mapToInt(Student :: getScore)
				.sum();
		System.out.println(sum1);
		
		int sum2 = studentList.stream()
				.map(Student :: getScore)
				.reduce((a,b) -> a+b)
				.get();
		System.out.println(sum2);
		
		int sum3 = studentList.stream()
				.map(Student :: getScore)
				.reduce(0, (a,b) -> a+b);
		
		System.out.println(sum3);
				
	}
}
