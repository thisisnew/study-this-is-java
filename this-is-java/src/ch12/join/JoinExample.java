package ch12.join;

public class JoinExample {
	public static void main(String[] args) {
		SumThread thread = new SumThread();
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("합: " + thread.getSum());
	}
}
