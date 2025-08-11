package homework.question3;

import java.util.Scanner;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {
		while (true) {
			System.out.println("===== (주)가남에 오신것을 환영합니다. =====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 입력: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch (num) {
				case 1: joinMember(); break;
				case 2: memberMenu(); break;
				case 3: sameName(); break;
				case 9: System.out.println("프로그램을 종료합니다."); return;
				default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요."); break;
			}
		}
	}
	
	public void memberMenu() {
		System.out.println("=== 2. 로그인 ===");
		while (true) {
			System.out.print("아이디: ");
			String id = sc.nextLine();
			System.out.print("비밀번호: ");
			String password = sc.nextLine();
		}
		// 1. 로그아웃전까지 메뉴 화면 반복 실행
		// 2. 각 메뉴 번호 입력하면 해당 메소드로 이동
		// 3. 잘못 입력하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요." 출력
		// ***** 회원 메뉴 *****
		// 회원 메뉴는 회원만 접근할 수 있습니다.
		// 먼저 회원가입, 로그인을 해주세요.
		// 1. 비밀번호 바꾸기 -> changePassword()실행
		// 2. 이름 바꾸기 -> changeName() 실행
		// 3. 로그아웃 -> "로그아웃 되었습니다." 출력 후 mainMenu로 돌아가기
		// (이전에 수행된 메소드로 돌아가려면 break; 대신 return; 코드를 사용)	
	}
	
	public void joinMember() {
		while (true) {
			System.out.println("=== 1. 회원가입 ===");
			System.out.print("아이디: ");
			String id = sc.nextLine();
			System.out.print("비밀번호: ");
			String password = sc.nextLine();
			System.out.print("이름: ");
			String name = sc.nextLine();
			
			Member member = new Member(password, name);
			boolean result = mc.joinMember(id, member);
			
			if (result == true) {
				System.out.println("성공적으로 회원가입 완료하였습니다.");
				return;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	
	public void logIn() {
		Member member = new Member();
		// 1. 아이디와 비밀번호를 사용자로부터 입력 받음
		System.out.print("아이디: ");
		String id = sc.nextLine();
		System.out.print("비밀번호: ");
		String password = sc.nextLine();
		// 2. mc의 logIn() 메소드로 넘겨줌
		String result = mc.logIn(id, password);
		// 3. 반환 값이 있으면 "OOO님, 환영합니다!" 출력
		// -> 그 다음 로그인 화면(memberMenu() 메소드 호출)으로 이동
		// -> memberMenu 호출은 mainMenu() 메소드에서 수행
		// 4. 반환 값이 없으면 
		// -> "틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요."출력
		// -> 올바른 아이디와 비밀번호를 입력할때까지 반복
		while (true) {			
			if (result.equals(member.getName())) {
				System.out.println(member.getName() + "님, 환영합니다!!");
				return;
			} else {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			}
		}
	}
	public void changePassword() {
		// 1. 아이디와 기존 비밀번호, 변경할 비밀번호 입력 받음
		// 2. mc의 changePassword()로 보내기
		// 3. mc의 changePassword로부터 받은 결과값이 true
		// -> "비밀번호 변경에 성공했습니다." 출력
		// 4. mc의 changePassword로부터 받은 결과값이 false
		// -> "비밀번호 변경에 실패했습니다. 다시 입력해주세요." 출력
		// -> 비밀번호 변경에 성공할 때까지 반복
	}
	
	public void changeName() {
		// 1. 아이디와 비밀번호를 입력 받음
		// 2. mc의 logIn()으로 아이디, 비밀번호 전달해서 현재 저장되어 있는 이름 받음
		// 3. mc.logIn()에서 전달받은 문자열이 null이 아닌 경우
		// 3-1.사용자에게 현재 저장되어 있는 이름을 출력해서 보여줌
		// 		사용자로부터 변경할 이름을 입력 받음
		// 		mc의 changeName()으로 id와 함께 넘김
		// 		"이름 변경에 성공하였습니다."출력
		// 3-2. 만일 logIn()으로부터 저장되어 있는 이름을 받지 못했다면
		// "이름 변경에 실패했습니다. 다시 입력해주세요"출력
		// logIn logIn()으로부터 저장되어 있는 이름을 받을 때까지 반복
	}
	
	public void sameName() {
		// 1. 검색할 이름을 받고 mc의 sameName()메소드로 넘김. 
		// -> mc의 sameName()은 TreeMap<String,String>을 리턴
		// 2. 반환 값을 가지고 entrySet()을 이용하여 ‘이름-아이디’ 형식으로 출력 
	}

}
