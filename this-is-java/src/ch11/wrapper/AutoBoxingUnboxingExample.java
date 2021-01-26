package ch11.wrapper;

public class AutoBoxingUnboxingExample {
	public static void main(String[] args) {
		
		//auto boxing
		Integer obj = 10;
		System.out.println(obj.intValue());
		
		//auto unboxing #1
		int value = obj;
		System.out.println(value);
		
		//auto unboxing #2
		int result = obj + 100;
		System.out.println(result);
	}
}
