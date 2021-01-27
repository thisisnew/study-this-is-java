package ch14;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = () -> {
			String str = "method call";
			System.out.println(str);
		};
		
		fi.method();
		
		fi = () -> {
			System.out.println("method Call 2");
		};
		
		fi.method();
		
		fi = () -> System.out.println("method Call 3");
		fi.method();
	}
}
