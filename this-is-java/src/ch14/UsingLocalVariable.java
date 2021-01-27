package ch14;

public class UsingLocalVariable {
	void methid(int arg) {
		int localVar = 40;
		
		MyFunctionalInterface fi = () -> {
			System.out.println("localVar : " + localVar);
			System.out.println("arg : " + arg);
		};
		
		fi.method();
		
	}
}
