package ch12.nofity;

public class ProducerThread extends Thread{
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 4; i++) {
			String data = "Data--" + i;
			dataBox.setData(data);
		}
	}
}
