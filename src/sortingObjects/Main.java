package sortingObjects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
	
	public static void main(String[] args) {
		
//requires Hashcode method in Book.java
		Map<Book, Integer> books = new HashMap<Book, Integer>();
		books.put(new Book(1,"The Lord of the Rings","J. R. R. Tolkien"),7);
		books.put(new Book(2,"Le Petit Prince","Antoine de Saint-Exupery"),9);
		books.put(new Book(3,"Harry Potter and the Philosopher's Stone","J. K. Rowling"),0);
		books.put(new Book(4,"And Then There Were None","Agatha Christie"),15);
		books.put(new Book(5,"Dream of the Red Chamber","Cao Xueqin"),14);
		books.put(new Book(6,"The Hobbit","J. R. R. Tolkien"),12);
		books.put(new Book(7,"She: A History of Adventure","H. Rider Haggard"),13);
		books.put(new Book(8,"The Lion, the Witch and the Wardrobe","C. S. Lewis"),11);
		books.put(new Book(9,"The Da Vinci Code","Dan Brown"),8);
		books.put(new Book(10,"The Catcher in the Rye","J. D. Salinger"),3);
		books.put(new Book(11,"The Hobbit","A. A. Milne"),2);		
		
		Integer result = books.get(new Book(6,"The Hobbit","J. R. R. Tolkien"));
		System.out.println(result);
		
		
//		List<Book> books = new ArrayList<Book>();
//		books.add(new Book(1,"The Lord of the Rings","J. R. R. Tolkien"));
//		books.add(new Book(2,"Le Petit Prince","Antoine de Saint-Exupery"));
//		books.add(new Book(3,"Harry Potter and the Philosopher's Stone","J. K. Rowling"));
//		books.add(new Book(4,"And Then There Were None","Agatha Christie"));
//		books.add(new Book(5,"Dream of the Red Chamber","Cao Xueqin"));
//		books.add(new Book(6,"The Hobbit","J. R. R. Tolkien"));
//		books.add(new Book(7,"She: A History of Adventure","H. Rider Haggard"));
//		books.add(new Book(8,"The Lion, the Witch and the Wardrobe","C. S. Lewis"));
//		books.add(new Book(9,"The Da Vinci Code","Dan Brown"));
//		books.add(new Book(10,"The Catcher in the Rye","J. D. Salinger"));
//		books.add(new Book(11,"The Hobbit","A. A. Milne"));
		
//		Collections.sort(books); 
//now works because of compareTo() in Book.class; now list of objects that implements comparable
//List needs to contain objects that implement the comparable interface which provides default sort order
		
//Using Collections.sort with comparator: list is 1st parameter, instance of comparator is second parameter in method call
//		Collections.sort(books, new ReverseTitleComparator());

//Can't instantiate an interface, but can if give it an implementation
//Create anonymous inner class (to sort by id number)
//Have to create new instance of interface where implementation follows
//		Collections.sort(books, new Comparator<Book>() {
//
//			@Override
//			public int compare(Book o1, Book o2) {
//				return - (o1.getId() - o2.getId());
//			}  
//			
//		});
		
//		for (Book nextBook : books) {
//			System.out.println(nextBook);
//		}
	}

}
