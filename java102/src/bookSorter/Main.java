package bookSorter;

import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {

		HashSet<Book> books1 = new HashSet<Book>();

		Book book = new Book("Korku Kitabý", 100, "Arkýn", Date.from(Instant.now()));
		Book book1 = new Book("Aksiyon Kitabý", 200, "Cahit", Date.from(Instant.now()));
		Book book2 = new Book("Macera Kitabý", 400, "Barkýn", Date.from(Instant.now()));
		Book book3 = new Book("Biyografi Kitabý", 300, "Özer", Date.from(Instant.now()));
		Book book4 = new Book("Tarih Kitabý", 500, "Öz", Date.from(Instant.now()));

		books1.add(book);
		books1.add(book1);
		books1.add(book2);
		books1.add(book3);
		books1.add(book4);

		for (Book b : books1) {
			System.out.println(
					b.getBookName() + "\t" + b.getPageNumber() + "\t" + b.getWriterName() + "\t" + b.getPublishDate());
		}

		System.out.println();
		TreeSet<Book> books2 = new TreeSet<Book>();
		books2.add(book);
		books2.add(book1);
		books2.add(book2);
		books2.add(book3);
		books2.add(book4);

		for (Book b : books2) {
			System.out.println(
					b.getBookName() + "\t" + b.getPageNumber() + "\t" + b.getWriterName() + "\t" + b.getPublishDate());
		}

		/*
		 * OUTPUT: 
		 * Aksiyon Kitabý 200 Cahit Thu Jul 29 15:22:40 TRT 2021 
		 * Biyografi Kitabý 300 Özer Thu Jul 29 15:22:40 TRT 2021 
		 * Macera Kitabý 400 Barkýn Thu Jul 29 15:22:40 TRT 2021 
		 * Korku Kitabý 100 Arkýn Thu Jul 29 15:22:40 TRT 2021
		 * Tarih Kitabý 500 Öz Thu Jul 29 15:22:40 TRT 2021
		 * 
		 * Tarih Kitabý 500 Öz Thu Jul 29 15:22:40 TRT 2021
		 * Macera Kitabý 400 Barkýn Thu Jul 29 15:22:40 TRT 2021
		 * Biyografi Kitabý 300 Özer Thu Jul 29 15:22:40 TRT 2021
		 * Aksiyon Kitabý 200 Cahit Thu Jul 29 15:22:40 TRT 2021
		 * Korku Kitabý 100 Arkýn Thu Jul 29 15:22:40 TRT 2021
		 */

	}
}
