package ch13.extend;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		int result = Util.compare(10, 20);
		System.out.println(result);
		
		int result2 = Util.compare(4.5, 1);
		System.out.println(result2);
	}
}
