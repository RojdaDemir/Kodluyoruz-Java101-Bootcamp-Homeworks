package question2.ranking;

public class Book implements Comparable<Book>{

	private String bookName;
	private String authorName;
	private int pageCount;
	private int publishYear;
	
	public Book(String bookName, String authorName, int pageCount, int publishYear) {
		
		this.bookName = bookName;
		this.authorName = authorName;
		this.pageCount = pageCount;
		this.publishYear = publishYear;
	}
	
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public int getPageCount() {
		return pageCount;
	}
	
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	public int getPublishYear() {
		return publishYear;
	}
	
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	
	@Override
	public int compareTo(Book o) {
		
		return this.getBookName().compareTo(o.getBookName());
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + pageCount;
		result = prime * result + publishYear;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (pageCount != other.pageCount)
			return false;
		if (publishYear != other.publishYear)
			return false;
		return true;
	}


	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(this.getBookName());
		builder.append(" - ");
		builder.append(this.getAuthorName());
		builder.append(" - ");
		builder.append(this.pageCount);
		builder.append(" - ");
		builder.append(this.publishYear);
		builder.append("]");
		
		return builder.toString();
		
		
	}
     
	
	
	
	
}
