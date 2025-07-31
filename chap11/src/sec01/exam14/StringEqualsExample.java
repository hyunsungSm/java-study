package sec01.exam14;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVal1 = new String("김재현");
		String strVal2 = "김재현";
		String strVal3 = "김재현";
		
		if (strVal1 == strVal2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");			
		}
		
		if (strVal2 == strVal3) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");			
		}
		
		if (strVal1.equals(strVal2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
		
		if (strVal2.equals(strVal3)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
	}

}
