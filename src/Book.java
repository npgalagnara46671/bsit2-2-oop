public class Book {
    String title = "";
    String author = "";
    int pages;
    boolean isAvailable;

    public Book() {
        isAvailable = true;
    }

    public void setBookDetails(String titleDetails, String authorDetails, int pagesDetails) {
        title = titleDetails;
        author = authorDetails;
        pages = pagesDetails;
        System.out.println("A new book '" + title + "' by author '" + author + "' has been added to the library!");
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        if (isAvailable == true) {
            System.out.println("Available: Yes");
        } else {
            System.out.println("Available: No");
        }
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("The book '" + title + "' has been returned. It is now available for borrowing.");
        } else {
            System.out.println("This book was not borrowed.");
        }
    }
}
