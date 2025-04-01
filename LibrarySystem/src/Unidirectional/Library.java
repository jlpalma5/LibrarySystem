package Unidirectional;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books;
	
	public Library() {
		books = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println("\n" + book.getTitle() + " has been successfully added!");
	}
	
	public void removeBook(String title) {
		Book bookToRemove = null;
		
		for(Book book : books) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				bookToRemove = book;
				break;
			}
			
			if(bookToRemove != null) {
				books.remove(bookToRemove);
				System.out.println("\n" + title + " has been successfully remove!");
			} else {
				System.err.println("The book is not found!");
			}
		}
	}
	
	public static void displayBooks() {
		System.out.println("------------------------");
		System.out.println("     LIBRARY BOOKS      ");
		System.out.println("------------------------");
		System.out.println("Book Title: " );
	}

	public void findByTitle() {
		
	}
	
	public void findByAuthor() {
		
	}
	
	public void findByPublisher() {
		
	}
	
	public void countBooks() {
		
	}

	public void searchBook() {
		
		
	}
}
