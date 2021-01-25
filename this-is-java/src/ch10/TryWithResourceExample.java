package ch10;

import java.io.FileInputStream;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try(FileInput fis = new FileInput("file.txt")){
			fis.read();
		}catch(Exception e) {
			System.out.println("예외 발생!!!!!!!!!!!!!!!!!!!!!");
		}
	}
}
