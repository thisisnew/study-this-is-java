package ch14.practice;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class LambdaExample2 {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("아무개", 95, 93)
	};
	
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		
		for(Student student : students) {
			sum += function.applyAsInt(student);
		}
		
		return (double) sum / students.length;
	}
	
	public static void main(String[] args) {
		//double englishAvg = avg(s -> s.getEnglishScore());
		double englishAvg = avg(Student :: getEnglishScore);
		System.out.println("영어점수 평균: " + englishAvg);
		
		//double mathAvg = avg(s -> s.getMathScore());
		double mathAvg = avg(Student :: getMathScore);
		System.out.println("수학점수 평균: " + mathAvg);
	}
	
	public static class Student {
		private String name;
		private int mathScore;
		private int englishScore;
		
		public Student(String name, int mathScore, int englishScore) {
			this.name = name;
			this.mathScore = mathScore;
			this.englishScore = englishScore;
		}

		public String getName() {
			return name;
		}

		public int getMathScore() {
			return mathScore;
		}

		public int getEnglishScore() {
			return englishScore;
		}
		
	}
}

