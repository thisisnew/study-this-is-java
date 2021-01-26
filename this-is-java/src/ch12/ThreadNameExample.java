package ch12;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 쓰레드 이름: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		threadB.start();
	}
}
