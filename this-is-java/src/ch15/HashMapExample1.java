package ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("테스트", 88);
		map.put("홍길동", 12);
		map.put("동장군", 95);
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> itor = entrySet.iterator();
		while(itor.hasNext()) {
			Map.Entry<String, Integer> entry = itor.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key +"," + value );
		}
	}
}
