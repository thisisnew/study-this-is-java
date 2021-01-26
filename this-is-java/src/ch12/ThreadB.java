package ch12;

public class ThreadB extends Thread{
	
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(getName());
		}
	}

}
