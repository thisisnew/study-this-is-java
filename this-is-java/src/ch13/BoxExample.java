package ch13;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("문자열");
		System.out.println(box.get());
		
	}
}
