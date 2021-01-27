package ch13.wildCard;

import java.util.Arrays;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStundents()));
	}
	
	public static void registerCourseStudents(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStundents()));
	}
	
	public static void registerCourseWorkers(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStundents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생",5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		
		System.out.println();
		
		registerCourseStudents(studentCourse);
		registerCourseStudents(highStudentCourse);
		
		System.out.println();
		
		registerCourseWorkers(personCourse);
		registerCourseWorkers(workerCourse);
		
	}
}
