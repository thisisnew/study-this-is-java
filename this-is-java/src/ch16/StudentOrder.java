package ch16;

public class StudentOrder implements Comparable<StudentOrder>{
	
	private String name;
	private int score;
	
	public StudentOrder(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	
	
	public String getName() {
		return name;
	}



	public int getScore() {
		return score;
	}



	@Override
	public int compareTo(StudentOrder o) {
		return Integer.compare(score, o.score);
	}
}
