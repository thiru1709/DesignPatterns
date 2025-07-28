package DesignPatterns.StructuralDesignPatterns.FlyWeightPattern;

public class BorrowDetails {

    private String borrowerName;
    private String dueDate;
    private boolean isReturned;

    public BorrowDetails(String borrowerName,String dueDate, boolean isReturned){
        this.borrowerName = borrowerName;
        this.dueDate = dueDate;
        this.isReturned = isReturned;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public boolean getIsReturned() {
        return isReturned;
    }

    public String getDueDate() {
        return dueDate;
    }
}
