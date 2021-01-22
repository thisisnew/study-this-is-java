package ch08;

public class SmartTv implements Searchable, RemoteControl{
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("스마트TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스마트TV를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Smart TV 볼륨 : " + volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다");
		
	}

}
