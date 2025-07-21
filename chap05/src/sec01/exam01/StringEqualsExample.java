package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strValue1 = "김재현";
		String strValue2 = "김재현";
		
		// 번지(주소값)을 비교 => 동일한 객체인지 비교
		if (strValue1 == strValue2) {
			System.out.println("strValue1과 strValue2는 참조가 같음");
		} else {
			System.out.println("strValue1과 strValue2는 참조가 다름");
		}
		
		// 순수 문자열 비교
		if (strValue1.equals(strValue2)) {
			System.out.println("strValue1과 stValue2는 문자열이 같음");
		} else {
			System.out.println("strValue1과 stValue2는 문자열이 다름");
		}
		
		String strValue3 = new String("김재현");
		String strValue4 = new String("김재현");
		
		// 번지(주소값)을 비교 => 동일한 객체인지 비교
		if (strValue3 == strValue4) {
			System.out.println("strValue3과 strValue4는 참조가 같음");
		} else {
			System.out.println("strValue3과 strValue4는 참조가 다름");
		}
		
		// 순수 문자열 비교
		if (strValue3.equals(strValue4)) {
			System.out.println("strValue3과 stValue4는 문자열이 같음");
		} else {
			System.out.println("strValue3과 stValue4는 문자열이 다름");
		}
		
	}

}
