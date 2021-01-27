package ch12.nofity;

public class ConsumerThread extends Thread{
	private DataBox dataBox;
	
	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 4; i++) {
			dataBox.getData();
		}
	}
}
