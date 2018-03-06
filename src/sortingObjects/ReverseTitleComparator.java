package sortingObjects;

import java.util.Comparator;

//Comparator, similar to Comparable interface, but because its a separate class can have more than one of them
//<Book> = object type comparing
//Sort books in reverse order:
public class ReverseTitleComparator implements Comparator<Book> {

	@Override
	public int compare(Book arg0, Book arg1) {
		return - (arg0.getTitle().compareTo(arg1.getTitle()));
	}

}
