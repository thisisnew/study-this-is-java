package ch05;

public class Exercise07 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int value : array) {
			if(value > max) {
				max = value;
			}
		}
		
		System.out.println("최대값 ---- " + max);

	}

}
