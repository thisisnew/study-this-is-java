package ch18;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
		String docu = "C:/Users/Kimdonghyun/Documents";
		File dir = new File(docu + "/Dir");
		File file1 = new File(docu + "/file1.txt");
		File file2 = new File(docu + "/file2.txt");
		
		if(!dir.exists()) dir.mkdirs();
		if(!file1.exists()) file1.createNewFile();
		if(!file2.exists()) file2.createNewFile();
		
		File temp = new File(docu);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		File[] contents = temp.listFiles();
		System.out.println("날자 시간 형태 크기 이름");
		System.out.println("-----------------------------------------");
		
		for(File file : contents) {
			System.out.println(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length()+ "\t" + file.getName());
			}
			System.out.println();
		}
		
	}
}
