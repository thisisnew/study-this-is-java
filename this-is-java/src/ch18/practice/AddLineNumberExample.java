package ch18.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class AddLineNumberExample {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		String read = "";
		int num = 0;
		
		try {
			fr = new FileReader("C:/Users/Kimdonghyun/Documents/test.java");
			br = new BufferedReader(fr);
			
			while((read = br.readLine()) != null) {
				System.out.println(++num + ":" + read);
			}
			
			br.close();
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
