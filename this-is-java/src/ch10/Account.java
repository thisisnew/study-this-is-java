package ch10;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(long balance) {
		this.balance += balance;
	}
	
	public void withDraw(long money) throws BalanceInsufficientException{
		if(this.balance < money) {
			throw new BalanceInsufficientException("잔고부족:" + getBalance());
		}
		
		this.balance -= money;
	}
}
