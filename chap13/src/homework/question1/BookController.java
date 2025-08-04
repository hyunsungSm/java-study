package homework.question1;

import java.util.ArrayList;
import java.util.List;

public class BookController {
	List<Book> BookList = new ArrayList<Book>();
	
	public BookController() {
		Book bk = new Book();
	}
	
	public void insertBook(Book bk){
		BookList.add(bk);
	}
	
	public List<Book> selectList(){
		return BookList;
	}
	
//	public List<Book> searchBook(String keyword){
        // 1. 검색 결과 리스트를 담아줄 리스트(ArrayList searchList) 선언 및 생성
//		List<Book> searchList = new ArrayList<Book>();
        // 2. 반복문을 통해 list의 책 이름 중에 전달받은 keyword 포함된 경우
        // -> String에 특정 문자열이 포함되었는지 확인할 때
        // String데이터.contains("특정 문자열")
//		if (BookList.contains(keyword)) {
//			searchList.add(keyword);
//		}
        // 3. searchList에 해당 책 추가
        // 4. searchList 반환
//    }
}
