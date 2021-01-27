package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("아무개", 95, 93)
	);
	
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		
		return (double) sum / list.size();
	}
	
	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println(englishAvg);
		
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println(mathAvg);
	}
}
