package ch07;

public class ComputerExample {
	public static void main(String[] args) {
		double r = 10.0;
		
		Calculator cal = new Calculator();
		double res = cal.areaCircle(10);
		
		System.out.println(res);
		
		Computer com = new Computer();
		res = com.areaCircle(10);
		
		System.out.println(res);
		
	}
}
