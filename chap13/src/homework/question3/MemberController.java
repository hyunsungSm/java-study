package homework.question3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MemberController {
	Map<String, Member> map = new HashMap<String, Member>();
	
	public boolean joinMember(String id, Member member) {
		// 1. 전달 받은 id가 없다면 id와 m을 map에 추가후 true 반환
		// -> containsKey로 판단
		// 2. 이미 있다면 false 값 반환
		if (map.containsKey(id)) {
			map.put(id, member);
			return true;
		} else {
			return false;
		}
	}
	
	public String logIn(String id, String password) {
		// 1. 전달 받은 id가 존재하는지 확인
		// -> containsKey로 판단
		// 2. 존재하면 Member에 저장된 비밀번호와 사용자가 입력한 비밀번호 비교
		// 3. 같다면 저장된 Member의 이름 반환
		// 4. 그 외의 모든 상황에서는 null 반환
		if (map.containsKey(id)) {
			if (map.containsKey(password)) {
				Member member = new Member();
				return member.getName();
			} 
		}
		
		return null;
	}

	public boolean changePassword(String id, String oldPw, String newPw) {
		// 1. 아이디가 존재하면서 
		// + 저장된 비밀번호와 사용자가 입력한 비밀번호가 같을 때
		// 2. 새로운 비밀번호로 바꾸고 true 반환
		// 3. 그 외의 모든 상황에서는 false 반환
		if (map.containsKey(id)) {
			if (map.get(oldPw).equals(newPw)) {
				oldPw = newPw;
				return true;
			}
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		// 1. 전달 받은 id를 통해 Member의 이름을 새로 입력한 이름으로 변경
		if (map.get(id).equals(newName)) {
			id = newName;
		}
	}
	
	public TreeMap<String,String> sameName(String name) {
		// 1. 전달받은 name이 저장된 데이터의 이름과 같은지 확인
		// 2. 전달받은 name과 저장된 데이터의 name이 같다면
		// -> key를 기준으로 오름차순 해주는 TreeMap 객체에 id와 이름 저장 후 객체 반환
		// -> 엘리먼트를 하나씩 뽑아낼때 keySet()을 쓸 것
		if (map.containsKey(name)) {
			Map<String, String> map = new TreeMap<String, String>();
			map.put(name, name);
			
		}
		return null;		
	}
}
