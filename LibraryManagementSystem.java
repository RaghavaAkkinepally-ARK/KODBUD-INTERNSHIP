import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class LibraryManagementSystem {

    static ArrayList<Book> library = new ArrayList<>();

    
    static void addBook(Scanner sc) {
        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        library.add(new Book(title, author));
        System.out.println("Book added successfully.");
    }

   
    static void displayBooks() {
        if (library.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\n--- Book List ---");
        for (Book book : library) {
            System.out.println("Title: " + book.title + ", Author: " + book.author);
        }
    }

    
    static void searchBook(Scanner sc) {
        System.out.print("Enter book title to search: ");
        String searchTitle = sc.nextLine();
        boolean found = false;

        for (Book book : library) {
            if (book.title.equalsIgnoreCase(searchTitle)) {
                System.out.println("Book found: " + book.title + " by " + book.author);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }


    static void removeBook(Scanner sc) {
        System.out.print("Enter book title to remove: ");
        String removeTitle = sc.nextLine();
        boolean removed = false;

        for (Book book : library) {
            if (book.title.equalsIgnoreCase(removeTitle)) {
                library.remove(book);
                System.out.println("Book removed successfully.");
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("Book not found.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    addBook(sc);
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    searchBook(sc);
                    break;
                case 4:
                    removeBook(sc);
                    break;
                case 5:
                    System.out.println("Exiting Library System.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
