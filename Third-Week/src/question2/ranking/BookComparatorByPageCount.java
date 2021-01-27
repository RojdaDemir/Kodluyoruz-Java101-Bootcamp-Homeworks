package question2.ranking;

import java.util.Comparator;

public class BookComparatorByPageCount implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		
		int book1pageCount = o1.getPageCount();
		int book2pageCount = o2.getPageCount();
	
		if(book1pageCount > book2pageCount) {
			return 1;
		}
		else if(book1pageCount < book2pageCount) {
			return -1;
		}
		
		else {
			return 0; 
		}
	}

	
}
