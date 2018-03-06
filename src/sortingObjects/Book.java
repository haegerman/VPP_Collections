package sortingObjects;

import java.util.Comparator;

//Comparable is a generic class so need to specify what is being compared = <Book>
//Comparable gives class default/natural sorting order, though can only have 1 compareTo()
public class Book implements Comparable<Book>{
	
//Hashcode method
	@Override
	public int hashCode() {
		final int prime = 31; //helps java create wide range of possible hashcode numbers
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	
//Method rtns true if two objects are considered equal (e.g. have same title and author) otherwise trns false
	@Override
	public boolean equals(Object obj) {
		if (this == obj)							//is object the same
			return true;							//then trns true
		if (obj == null)							//does object exist
			return false;							//rtns false
		if (getClass() != obj.getClass())			//checks class types match
			return false;
		Book other = (Book) obj;					//if they match cast the object to a book 
		if (author == null) {						//and check fields (author and title)
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;								//these are the same book!
	}

	public static class ReverseTitleComparator implements Comparator<Book> {

		@Override
		public int compare(Book arg0, Book arg1) {
			return - (arg0.getTitle().compareTo(arg1.getTitle()));
		}
	}
	
	private int id;
	private String title;
	private String author;
	
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}

	public Book(int id, String title, String author) { //Constructor lets one set the get methods
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	public String toString() { //toString method rtns title and author
		return title + " by " + author;
	}

	@Override //gets auto-generated when clicking on add unimplemented methods
	public int compareTo(Book o) {
//		return this.id - o.getId(); //allows sorting of books by id number
//		return - (this.id - o.getId()); //- allows sorting in reverse order
//		return (this.title.compareTo(o.getTitle())); //compare by title
//		return (this.author.compareTo(o.getAuthor())); //compare by author
		
		int result = (this.title.compareTo(o.getTitle()));
		if (result == 0) {
			return (this.author.compareTo(o.getAuthor()));
		}
		else {
			return result;
		}
	}

	
		
}
