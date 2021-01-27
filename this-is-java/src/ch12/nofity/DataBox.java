package ch12.nofity;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("consumerThread가 읽은 데이터 : " + this.data);
		data = null;
		notify();
		
		return this.data;
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		
		this.data = data;
		System.out.println("producer thread가 생성한 데이터 : " + data);
		notify();
	}
}
