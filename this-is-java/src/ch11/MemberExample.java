package ch11;

public class MemberExample {
	public static void main(String[] args) {
		Member original = new Member("blue", "홍길동", "12345", 25, true);
		
		Member cloned = original.getMember();
		original.password = "999";
		cloned.password = "67890";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("cloned id : " + cloned.id);
		System.out.println("cloned pass : " + cloned.password);
		System.out.println("cloned name : " + cloned.name);
		System.out.println("cloned age : " + cloned.age);
		System.out.println("cloned adult : " + cloned.adult);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id : " + original.id);
		System.out.println("pass : " + original.password);
		System.out.println("name : " + original.name);
		System.out.println("age : " + original.age);
		System.out.println("adult : " + original.adult);
	}
}
