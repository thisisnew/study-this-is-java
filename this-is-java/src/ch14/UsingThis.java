package ch14;

public class UsingThis {
	public int outterFiled = 10;
	
	class Inner {
		int innerField = 20;
		
		void method() {
			MyFunctionalInterface fi = () -> {
				System.out.println("outterFiled: " + outterFiled);
				System.out.println("outterFiled: " + UsingThis.this.outterFiled);
				System.out.println("innerField: " + innerField);
				System.out.println("innerField: " + this.innerField);
			};
			
			fi.method();
		}
	}
}
