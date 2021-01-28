package ch15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) {
		try {
			Properties properties = new Properties();
			String path = PropertiesExample.class.getResource("database.properties").getPath();
			path = URLDecoder.decode(path, "utf-8");
			properties.load(new FileReader(path));
			
			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String userName = properties.getProperty("username");
			String password = properties.getProperty("password");
			
			System.out.println(driver);
			System.out.println(url);
			System.out.println(userName);
			System.out.println(password);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
