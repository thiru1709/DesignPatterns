package DesignPatterns.StructuralDesignPatterns.FlyWeightPattern;

public class BookImpl implements Book{

    private String title;
    private String author;
    private String isbn;

    public BookImpl(String title,String author,String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void displayDetails(BorrowDetails borrowDetails) {
        System.out.println("Book Details : ");
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("isBn : " + isbn);
        System.out.println("Borrower Details are : ");
        System.out.println("Borrower : " + borrowDetails.getBorrowerName());
        System.out.println("Due date : " + borrowDetails.getDueDate());
        String returnStatus = borrowDetails.getIsReturned() ? "Returned" : "Not Returned";
        System.out.println("Return status : " + returnStatus);
        System.out.println("-----------------------------------------------");

    }
}