package ch11.stringClass;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str = new String(bytes);
		System.out.println(str);
		
		str = new String(bytes, 6, 4);
		System.out.println(str);
	}
}
