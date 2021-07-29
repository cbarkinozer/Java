package bookSorter;

import java.util.Date;

public class Book implements Comparable<Book> {
	private String bookName;
	private int pageNumber;
	private String writerName;
	private Date publishDate;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getWriterName() {
		return writerName;
	}

	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public Book(String bookName, int pageNumber, String writerName, Date publishDate) {
		super();
		this.bookName = bookName;
		this.pageNumber = pageNumber;
		this.writerName = writerName;
		this.publishDate = publishDate;
	}

	@Override
	public int compareTo(Book book) {
		return book.getPageNumber() - pageNumber;
	}

	/*
	 * @Override public int compareTo(Book book) { if(
	 * bookName.compareTo(book.bookName) == 0 ) return 0; else if(
	 * bookName.compareTo(book.bookName) > 0 ) return 1; else{ return -1; } }
	 */

}
