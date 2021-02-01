package ch18;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		String originalFileName = "C:/Users/Kimdonghyun/Documents/test.js";
		File file = new File(originalFileName);
		FileWriter fw = new FileWriter(file);
		fw.write("FileWriter는 한글로된 " + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
	}
}
