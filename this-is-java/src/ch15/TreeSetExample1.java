package ch15;

import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(87);
		set.add(98);
		set.add(75);
		
		int min = set.first();
		System.out.println(min);
		
		int max = set.last();
		System.out.println(max);
		
		int lower = set.lower(98);
		System.out.println(lower);
		
		int higher = set.higher(87);
		System.out.println(higher);
	}
}
