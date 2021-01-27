package ch13.extend;

public class ChildProductAndStorageExample {
	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<Tv, String, String>();
		product.setKind(new Tv());
		product.setModel("Smart TV");
		product.setCompany("Samsung");
		
		Storage<Tv> strorage = new StorageImpl<Tv>(100);
		strorage.add(new Tv(), 0);
		Tv tv = strorage.get(0);
	}
}
