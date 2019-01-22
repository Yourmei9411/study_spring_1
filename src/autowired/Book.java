package autowired;

public class Book {

	private String bookName;
	private int page;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", page=" + page + "]";
	}
}
