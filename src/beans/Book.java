package beans;

public class Book {

	private String bookName;
	private int pages;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", pages=" + pages + "]";
	}
}
