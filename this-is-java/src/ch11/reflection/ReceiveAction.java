package ch11.reflection;

public class ReceiveAction implements Action{

	@Override
	public void excute() {
		System.out.println("데이터를 받습니다.");
	}

}
