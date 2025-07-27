package homework;

public class Account {
	private String accountNumber;
	private int balance;
	
	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
		
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	
	public boolean withdraw(int amount) {
		if(amount > 0 && balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}
	

}
