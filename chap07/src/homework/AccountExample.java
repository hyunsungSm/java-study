package homework;

public class AccountExample {

	public static void main(String[] args) {
		Account account1 = new Account("김철수", 1000);
		Account account2 = new Account("김자바", 500);
		
		Bank bank = new Bank();
		bank.transfer(account1, account2, 300);
		
		System.out.println("김철수의 계좌: " + account1.getBalance());
		System.out.println("김자바의 계좌: " + account2.getBalance());
		
	}
}
