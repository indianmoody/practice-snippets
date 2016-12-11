package mini2;

import java.util.*;

public class ObjectComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("The Alchemist");
		Book b2 = new Book("The Upside of Irrationality");
		Book b3 = new Book("The Google Story");
		Book b4 = new Book("Five Point Someone");
		
		ArrayList<Book> list = new ArrayList<Book>();
		Collections.addAll(list, b1, b2, b3, b4);
		Collections.sort(list);
		System.out.println(list);

	}

}

class Book implements Comparable<Book>{
	private String title;
	public Book(String title) {
		this.title = title;
	}
	
	public int compareTo(Book b) {
		return this.title.compareTo(b.title);
	}
	
	public String toString() {
		return this.title;
	}
}