package ch13.practice.ex03;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String, String> container1 = new Container<String, String>();
		container1.set("아무개", "개발자");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		System.out.println(name1);
		System.out.println(job);
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		
		System.out.println(name2);
		System.out.println(age);
	}
}
