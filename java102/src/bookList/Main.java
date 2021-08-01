package bookList;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();
		LinkedHashMap<String,String> booksMap = new LinkedHashMap<String,String>();
		Instant now = Instant.now();
		for(int i=0;i<books.size();i++) {
			books.add(new Book("barkin"+i, (100+i), "özer"+i, Date.from(now)));
		}
		for(int i=0;i<books.size();i++) {
			booksMap.put(books.get(i).getName(), books.get(i).getWriterName());
		}
		//Prints nothing, why?
		books.stream().filter(book -> book.getPageNumber() > 100).forEach(book -> System.out.println(book));
	}
}
