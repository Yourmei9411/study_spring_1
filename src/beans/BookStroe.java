package beans;

import java.util.Map;

public class BookStroe {
	
	private String bookstoreName;
	private Map<Integer, Book> books;
	
	public String getBookstoreName() {
		return bookstoreName;
	}
	public void setBookstoreName(String bookstoreName) {
		this.bookstoreName = bookstoreName;
	}
	public Map<Integer, Book> getBooks() {
		return books;
	}
	public void setBooks(Map<Integer, Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "BookStroe [bookstoreName=" + bookstoreName + ", books=" + books + "]";
	}
}
