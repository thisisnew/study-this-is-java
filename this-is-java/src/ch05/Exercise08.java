package ch05;

public class Exercise08 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int cnt = 0;
		
		for(int[] tempArr : array) {
			for(int value : tempArr) {
				sum += value;
				cnt++;
			}
		}
		
		avg = (double) sum/cnt;
		
		System.out.println("합: " + sum);
		System.out.println("평균: " + avg);
	}

}
