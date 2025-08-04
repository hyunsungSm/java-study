package homework.question1;

import java.util.ArrayList;
import java.util.Collections;
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
	
	public List<Book> searchBook(String keyword){
		List<Book> searchList = new ArrayList<Book>();
		
		if (BookList.contains(keyword)) {
			searchList.addAll(BookList);
		}
		return searchList;
    }
	
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		for (int i = 0; i < BookList.size(); i++) {
			Book book = BookList.get(i);
			if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
				removeBook = book;
				BookList.remove(i);
			}
		}
		return removeBook;
	}
	
	int ascBook() {
		Collections.sort(BookList);
		return 1;
	}	
}
