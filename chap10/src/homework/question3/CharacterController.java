package homework.question3;

public class CharacterController {
	String s;
	int count;
	
	public CharacterController() {
	}
	
	public int countAlpha(String s) throws CharCheckException {

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				count++;
			} else if (ch >= 'a' && ch <= 'z') {
				count++;
			} else if (ch == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");				
		}
	}
		System.out.println(s + "에 포함된 영문자 개수: " + count);
		return count;
	}
}
