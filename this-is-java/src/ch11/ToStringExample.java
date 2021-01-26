package ch11;

import java.util.Objects;

public class ToStringExample {
	public static void main(String[] args) {
		String name = null;
		
		System.out.println(Objects.toString(name, "홍길동"));
	}
}
