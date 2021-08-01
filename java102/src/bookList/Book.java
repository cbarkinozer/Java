package bookList;

import java.util.Date;

public class Book {
private String name;
private int pageNumber;
private String writerName;
private Date publishDate;



public Book(String name, int pageNumber, String writerName, Date publishDate) {
	super();
	this.name = name;
	this.pageNumber = pageNumber;
	this.writerName = writerName;
	this.publishDate = publishDate;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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

}
