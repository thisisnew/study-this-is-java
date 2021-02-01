package ch16.collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TolistExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
			new Student("홍길동", 10, Student.Sex.MALE),
			new Student("홍길동2", 6, Student.Sex.FEMALE),
			new Student("홍길동3", 10, Student.Sex.MALE),
			new Student("홍길동4", 6, Student.Sex.FEMALE)
		);
		
		
		
		//리스트로 만들기
		List<Student> maleList = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		Set<Student> femaleSet = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.FEMALE)
				.collect(Collectors.toCollection(HashSet :: new));
		femaleSet.stream()
			.forEach(s -> System.out.println(s.getName()));
		
	}
}
