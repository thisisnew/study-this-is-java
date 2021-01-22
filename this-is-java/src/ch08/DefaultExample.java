package ch08;

public class DefaultExample {
	public static void main(String[] args) {
		MyInterface miA = new MyClassA();
		miA.method1();
		miA.method2();
		
		MyInterface miB = new MyClassB();
		miB.method1();
		miB.method2();
	}
}
