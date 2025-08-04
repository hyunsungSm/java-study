package homework.question1;

import java.util.Scanner;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	int menu = 0;
	
	public void mainMenu() {
		while (true) {
			System.out.println("=== 가남 도서관에 오신걸 환영합니다 ===");
			System.out.println("원하시는 업무의 번호를 선택하세요.");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 오름차순 정렬");
			System.out.println("9. 종료");
			
			System.out.print("메뉴 선택: ");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
				case 1: break;
				case 2: break;
				case 3: break;
				case 4: break;
				case 5: break;
				case 9: break;
				default:
			}
		}
		
//		public void insertBook() {
//			System.out.print("도서명: ");
//			String title = sc.nextLine();
//			System.out.print("저자명: ");
//			String author = sc.nextLine();
//		}
		
	}
}
