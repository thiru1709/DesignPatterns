package DesignPatterns.StructuralDesignPatterns.FlyWeightPattern;

public class LibrarySystemDemo {

    public static void main(String[] args) {
        BookFactory bookFactory = new BookFactory();


        Book book1 = bookFactory.getBook("Effective Java", "Joshua Bloch", "123-456");
        Book book2 = bookFactory.getBook("Clean Code", "Robert C. Martin", "789-101");
        // Reuses the first book
        Book book3 = bookFactory.getBook("Effective Java", "Joshua Bloch", "123-456");

        // Create Borrow Details (Extrinsic State)
        BorrowDetails details1 = new BorrowDetails("Alice", "2025-02-10", false);
        BorrowDetails details2 = new BorrowDetails("Bob", "2025-03-05", true);
        BorrowDetails details3 = new BorrowDetails("Charlie", "2025-01-15", false);

        book1.displayDetails(details1);
        book2.displayDetails(details2);
        book3.displayDetails(details3);

    }
}
