package question5.streamlambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import question2.ranking.Book;


public class StreamAndLambda {

	public static void main(String[] args) {
		
	   List<Book> bookList = new ArrayList<Book>();
	   
	   bookList.add(new Book("Yeraltından Notlar","Fyodor Mihayloviç Dostoyevski",140,1864));
	   bookList.add(new Book("Sofie'nin Dünyası","Jostein Gaarder",591,1991));
	   bookList.add(new Book("Satranç","Stefan Zweig",83,1943));
	   bookList.add(new Book("Beyaz Diş","Jack London",258,1906));
	   bookList.add(new Book("1984","George Orwell",350,1949));
	   bookList.add(new Book("Kendini Bilmek","Michel Foucault",215,1988));
	   bookList.add(new Book("Kırlangıç Çığlığı","Ahmet Ümit",398,2018));
	   bookList.add(new Book("Bir Ömür Nasıl Yaşanır?","İlber Ortaylı",285,2019));
	   bookList.add(new Book("Bin Muhteşem Güneş","Khaled Hosseini",430,2007));
	   bookList.add(new Book("Beyaz Geceler","Fyodor Dostoyevski",94,1848));
	      
	   
      Function<Book, String> booksFunc = (book) -> {
    	  
    	  StringBuilder builder = new StringBuilder();
    	  builder.append(book.getBookName());
    	  builder.append(" - ");
    	  builder.append(book.getAuthorName());
    	  
    	  return builder.toString();
    	  
      };
      
      Consumer<String> consumerPrinter = (x) -> System.out.println(x); 
      
      System.out.println("Kitaplar ve Yazarları\n");
      
      bookList.stream().map(booksFunc).forEach(consumerPrinter);
    
            
      Predicate<Book> pageCount = (page) -> {
    	return  page.getPageCount() > 100;
      };
         
      List<Book> bookList2 = bookList.stream().filter(pageCount).collect(Collectors.toList());
      
      System.out.println("\nSayfa sayısı 100'den fazla olan kitap listesi\n");
      
      for(Book book: bookList2) 
      {
    	  System.out.println(book);
      }
          
	} 		
}
