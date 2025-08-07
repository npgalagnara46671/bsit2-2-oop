public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBookDetails("dasdasda", "hgalanagara", 11);
        System.out.println("Book No. 1");
        book1.displayInfo();
        book1.borrowBook();
        book1.returnBook();

    }
}
}
