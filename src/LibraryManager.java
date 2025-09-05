import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    private ArrayList<String> books;
    private Scanner scanner;

    public LibraryManager() {
        books = new ArrayList<>();
        books.add("Java Programming");
        books.add("Web Development");
        books.add("Database Design");
        scanner = new Scanner(System.in);
    }

    public void showBooks() {
        try {
            if (books == null) {
                throw new IllegalStateException("Error: Book list is not initialized!");
            }
            if (books.isEmpty()) {
                System.out.println("No books available in the library.");
            } else {
                System.out.println("\n--- Current Books ---");
                for (int i = 0; i < books.size(); i++) {
                    System.out.println((i + 1) + ". " + books.get(i));
                }
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Display operation completed.\n");
        }
    }

    public void addBook() {
        try {
            System.out.print("Enter book title to add: ");
            String title = scanner.nextLine();

            if (title == null || title.trim().isEmpty()) {
                throw new IllegalArgumentException("Error: Book title cannot be empty!");
            }
            if (title.length() < 3) {
                throw new IllegalArgumentException("Error: Book title must be at least 3 characters long!");
            }

            books.add(title);
            System.out.println("Book '" + title + "' added successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Add book operation completed.");
            showBooks();
        }
    }

    public void removeBook() {
        try {
            if (books.isEmpty()) {
                System.out.println("Error: No books available to remove!");
                return;
            }

            System.out.print("Enter book number to remove (1-" + books.size() + "): ");
            String input = scanner.nextLine();

            int index;
            try {
                index = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Error: Please enter a valid number!");
            }

            if (index < 1) {
                throw new IllegalArgumentException("Error: Book index cannot be negative or zero!");
            }
            if (index > books.size()) {
                throw new ArrayIndexOutOfBoundsException("Error: Invalid book number! Please enter between 1 and " + books.size() + ".");
            }

            String removedBook = books.remove(index - 1);
            System.out.println("Book '" + removedBook + "' removed successfully!");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Remove book operation completed.");
            showBooks();
        }
    }
}
