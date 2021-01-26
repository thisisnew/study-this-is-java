package ch11.reflection;

public class SendAction implements Action{

	@Override
	public void excute() {
		System.out.println("데이터를 보냅니다.");
	}
	
}
