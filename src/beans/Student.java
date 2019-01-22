package beans;

import java.util.List;

public class Student {

	private String StuName;
	private List<Book> books;
	
	public String getStuName() {
		return StuName;
	}
	public void setStuName(String stuName) {
		StuName = stuName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Student [StuName=" + StuName + ", books=" + books + "]";
	}
}
