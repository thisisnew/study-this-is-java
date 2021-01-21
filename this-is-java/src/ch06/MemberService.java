package ch06;

public class MemberService {
	
	String id;
	String password;
	
	public MemberService() {
		id = "hong";
		password = "12345";
	}
	
	public boolean login(String id, String password) {
		
		if(id.equals(this.id) && password.equals(this.password)) {
			return true;
		}
		
		return false;
	}
	
	public void logout(String id) {
		if(id.equals(this.id)) {
			System.out.println("로그아웃 되었습니다.");
		}
	}
	
}
