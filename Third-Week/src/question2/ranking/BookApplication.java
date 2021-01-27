package question2.ranking;

import java.util.Set;
import java.util.TreeSet;

public class BookApplication {


	public static void main(String[] args) {
		
		Set<Book> bookList = new TreeSet<Book>();
 		bookList.add(new Book("Martin Eden","Jack London",517,2014));
 		bookList.add(new Book("Kürk Mantolu Madonna","Sabahattin ALi",160,1943));
 		bookList.add(new Book("Olasılıksız","Adam Fawer",494,2005));
 		bookList.add(new Book("Yabancı","Albert Camus",110,1981));
 		bookList.add(new Book("Cesur Yeni Dünya","Aldous Huxley",266,1932));
 		
 		
 		System.out.println("Kitap ismine göre A'dan B'ye sıralanmış hali : \n");
 		printAllList(bookList);
 		
 		BookComparatorByPageCount comparatorPageCount = new BookComparatorByPageCount();
 		Set<Book> sortedBooksPageCount = new TreeSet<Book>(comparatorPageCount);
 		sortedBooksPageCount.addAll(bookList);
 		
 		System.out.println("Kitabın sayfa sayısına göre sıralanmış hali : \n");
 		printAllList(sortedBooksPageCount);
		
	}
	
	
	public static <T> void printAllList(Set<T> liste) {
		
		for(T value : liste) {
			System.out.println(value);
		}
		System.out.println();
	}
	
}
