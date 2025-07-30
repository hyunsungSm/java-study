package homework.question2;

public class UnSupportedException extends RuntimeException{

	public UnSupportedException(String message) {
		super(message);
	}

	public UnSupportedException() {
		throw new UnSupportedException("원인을 알수 없는 오류가 발생했습니다.");
	}
}
