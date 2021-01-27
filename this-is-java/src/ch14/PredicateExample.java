package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student2> list = Arrays.asList(
			new Student2("홍길동", "남자", 90),
			new Student2("김순희", "여자", 45),
			new Student2("테스트", "남자", 93),
			new Student2("아무개", "남자", 31)
	);
	
	public static double avg(Predicate<Student2> predicate) {
		int count = 0;
		int sum = 0;
		
		for(Student2 student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		
		return (double) sum / count;
	}
	
	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("남자"));
		System.out.println(maleAvg);
		
		double higherAvg = avg(t -> (t.getScore() >= 90));
		System.out.println(higherAvg);
	}
}
