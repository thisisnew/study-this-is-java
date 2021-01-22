package ch07;

public class Computer extends Calculator{
	
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle(" + r + ") 호출");
		
		return Math.PI * r;
	}
}
