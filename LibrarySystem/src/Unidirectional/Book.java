package Unidirectional;

public class Book {

	private String title;
	private Author author;
	private Publisher publisher;
	
	public Book(String title, Author author, Publisher publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	//getter methods
	public String getTitle() {
		return title;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public Publisher getPublisher() {
		return publisher;
	}
	
	//display method
	public void displayBookInfo() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author.getName());
		System.out.println("Publisher: " + publisher.getName());
		System.out.println("-----------------------------------");
	}
}
