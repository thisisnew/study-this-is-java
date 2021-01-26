package ch11.stringClass;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "A/B/C";
		
		StringTokenizer st = new StringTokenizer(text, "/");
		int tokens = st.countTokens();
		
//		for(int i = 0; i < tokens; i++) {
//			String token = st.nextToken();
//			System.out.println(token);
//		}
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);  
		}
	}
}
