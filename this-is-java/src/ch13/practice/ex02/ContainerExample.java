package ch13.practice.ex02;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String> container1 = new Container<String>();
		container1.set("테스트");
		String str = container1.get();
		
		System.out.println(str);
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();
		
		System.out.println(value);
	}
}
