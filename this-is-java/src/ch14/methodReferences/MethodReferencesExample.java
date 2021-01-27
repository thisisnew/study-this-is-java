package ch14.methodReferences;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println(operator.applyAsInt(1, 2));
		
		operator = Calculator :: staticMethod;
		System.out.println(operator.applyAsInt(3, 4));
		
		Calculator cal = new Calculator();
		operator = (x, y) -> cal.method(x, y);
		System.out.println(operator.applyAsInt(5, 6));
		
		operator = cal :: method;
		System.out.println(operator.applyAsInt(7, 8));
		
	}
}
