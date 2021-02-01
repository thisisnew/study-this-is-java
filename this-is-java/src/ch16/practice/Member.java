package ch16.practice;

public class Member {
	public static final int MALE = 0;
	public static int FEMALE = 1;
	
	private String name;
	private int sex;
	private int age;
	private String job;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Member(String name, String job) {
		this.name = name;
		this.job = job;
	}
	public Member(String name, int sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public String getJob() {
		return job;
	}

	public String getName() {
		return name;
	}
	
	
}
