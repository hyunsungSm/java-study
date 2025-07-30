package homework.question4;

public class NumController {
	
	public NumController() {
	}
	
	public boolean checkDouble(int num1, int num2) {
		if (!(num1 >= 1 && num1 <= 100) || !(num2 >= 1 && num2 <= 100)) {
			throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
		} else if(num1 % num2 == 0) {
			System.out.print(num1 + "은(는) " + num2 + "의 배수인가? ");
			return true;
		} else {
			System.out.print(num1 + "은(는) " + num2 + "의 배수인가? false");
			return false;
		}
		
	}

}
