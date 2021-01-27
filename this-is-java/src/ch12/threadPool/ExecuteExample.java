package ch12.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {
	public static void main(String[] args) {
		ExecutorService executorService =  Executors.newFixedThreadPool(2);
		
		for(int i=0; i < 10; i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("총 스레드 갯수: " + poolSize + " 작업 스레드 이름: " + threadName);
					
					int value = Integer.parseInt("dsdsds"); //예외발생
				}
			};
			
			//executorService.execute(runnable);
			executorService.submit(runnable);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		executorService.shutdown();
	}
}
