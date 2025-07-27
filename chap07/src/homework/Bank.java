package homework;

public class Bank {
	public void transfer(Account sender, Account receiver, int amount) {
		if (sender.withdraw(amount)) {
			receiver.deposit(amount);
			System.out.println("이체 성공: " + sender.getAccountNumber() + "가 " + receiver.getAccountNumber() + "에게 " + amount + " 이체완료");
		} else {
			System.out.println("이체 실패: " + sender.getAccountNumber() + "의 계좌");
		}
		
	}

}
