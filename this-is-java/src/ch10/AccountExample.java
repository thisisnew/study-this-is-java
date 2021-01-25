package ch10;

public class AccountExample {
	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.deposit(1000);
		System.out.println(acc.getBalance());
		
		try {
			acc.withDraw(1500);
		} catch (BalanceInsufficientException e) {
			System.out.println(e.getMessage());
			System.out.println();
			e.printStackTrace();
		}
	}
}
