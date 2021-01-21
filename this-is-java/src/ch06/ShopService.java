package ch06;

public class ShopService {
	
	private static ShopService single;
	
	private ShopService() {	
		single = new ShopService();
	}
	
	public static ShopService getInstance() {
		return single;
	}
}
