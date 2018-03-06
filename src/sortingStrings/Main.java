package sortingStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		String test1 = "hello";
		String test2 = "goodbye";
		String test3 = "goodbye";		
		System.out.println(test1.compareTo(test2)); //h comes after g therefore +1
		System.out.println(test2.compareTo(test1)); //g comes after h therefore -1
		System.out.println(test2.compareTo(test3)); //same word therefore 0
		
		List<String> strings = new ArrayList<String>(); //instantiate new ArrayList of Strings
		strings.add("one");
		strings.add("two");
		strings.add("three");
		strings.add("four");
		strings.add("five");
		strings.add("six");
		strings.add("seven");
		
		//static class method Collections, don't need to instantiate it
		//sort can sort Strings and changes from numerical to alphabetical order
		Collections.sort(strings);
		
		for (String nextString : strings) {
			System.out.println(nextString);
		}
	}
}
