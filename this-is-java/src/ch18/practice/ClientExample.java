package ch18.practice;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

public class ClientExample {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost", 5001);
		OutputStream os = socket.getOutputStream();
		
		String filePath = "C:/Users/Kimdonghyun/Documents/x9788989258056.jpg";
		File file = new File(filePath);
		
		String fileName = file.getName();
		byte[] fileNameByte = fileName.getBytes();
		fileNameByte = Arrays.copyOf(fileNameByte, 100);
		os.write(fileNameByte);

		System.out.println("[파일 보내기 시작] " + fileName);
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis =  new BufferedInputStream(fis);
		
		byte[] bytes = new byte[1000];
		int readByteCount = -1;
		
		while((readByteCount = bis.read(bytes)) != -1) {
			os.write(bytes, 0, readByteCount);
		}
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		bis.close();
		fis.close();
		os.close();
		socket.close();
	}
}
