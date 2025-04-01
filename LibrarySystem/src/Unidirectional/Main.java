package Unidirectional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        int choice;
        do {
            System.out.println("\n---- Library Menu ----");
            System.out.println("1. Add a Book");
            System.out.println("2. Remove a Book");
            System.out.println("3. Search Book");
            System.out.println("4. Count Books");
            System.out.println("5. Display Books");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();  
            
            switch (choice) {
                case 1:
                	System.out.println("-----------------------");
                	System.out.println("       Add Book        ");
                	System.out.println("-----------------------");
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    
                    System.out.print("Enter author name: ");
                    String authorName = scanner.nextLine();
                    Author author = new Author(authorName);
                    
                    System.out.print("Enter publisher name: ");
                    String publisherName = scanner.nextLine();
                    Publisher publisher = new Publisher(publisherName);
                    
                    Book newBook = new Book(title, author, publisher);
                    library.addBook(newBook);
                    break;
                
                case 2:
                	System.out.println("-----------------------");
                	System.out.println("      Remove Book      ");
                	System.out.println("-----------------------");
                	System.out.print("Enter book title to remove: ");
                    String bookTitleToRemove = scanner.nextLine();
                    library.removeBook(bookTitleToRemove);
                    break;
                
                case 3:
                	System.out.println("-----------------------");
                	System.out.println("      Search Book      ");
                	System.out.println("-----------------------");
                	
                
                case 4:
                	System.out.println("------------------------");
            		System.out.println("   Total No. of Books   ");
            		System.out.println("------------------------");
                    library.countBooks();
                    break;
                    
                case 5:
                	System.out.println("------------------------");
            		System.out.println("     LIBRARY BOOKS      ");
            		System.out.println("------------------------");
                	Library.displayBooks();
                    break;
                
                case 0:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 0) ;
    }
}
