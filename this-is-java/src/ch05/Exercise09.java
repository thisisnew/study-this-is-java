package ch05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
				case 1 : 
					System.out.print("학생수>");
					studentNum = scanner.nextInt();
					break;
				case 2 : 
					if(studentNum > 0) {
						scores = new int[studentNum];
						
						for(int i=0; i<scores.length; i++) {
							System.out.print("scores[" + i + "]>");
							scores[i] =  scanner.nextInt();
						}
					} else {
						System.out.println("[에러] 학생수를 먼저 입력해주세요.");
					}
					
					break;
				case 3 : 
						if(null != scores) {
							for(int i=0; i<scores.length; i++) {
								System.out.println("scores[" + i + "]>" + scores[i]);
							}
						}
					break;
				case 4 : 
						int max = 0;
						double sum = 0;
						double avg = 0;
						int cnt = 0;
						if(null != scores) {
							for(int score : scores) {
								if(max < score) {
									max = score;
								}
								
								sum += score;
								cnt++;
							}
						}
						
						avg = (double) sum/cnt;
						
						System.out.println("최고 점수: " + max);
						System.out.println("평균 점수: " + avg);
					break;
				case 5 : run = false;
					break;
			}
			
		}
		
		System.out.println("프로그램 종료");
	}
}
