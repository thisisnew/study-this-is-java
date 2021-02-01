package ch18;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		String originalFileName = "C:/Users/Kimdonghyun/Documents/x9788989258056.jpg";
		FileInputStream fis1 = new FileInputStream(originalFileName);
		start = System.currentTimeMillis();
		
		while(fis1.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("보조스트림을 사용하지않았을때 : " + (end - start) + "ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream(originalFileName);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		
		while(bis.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("보조스트림을 사용했을때 : " + (end - start) + "ms");
		bis.close();
		fis2.close();
	}
}
